
// -----------------
// Usage of 'this' :
// -----------------

class ThisExample {

    void run() {

        def plainClosure = { this }
        assert plainClosure() == this

        def nestedClosure = { ({ this })() }
        assert nestedClosure() == this
    }

}

new ThisExample().run()

// ------------------
// Usage of 'owner' :
// ------------------

class OwnerExample {

    void run() {

        def plainClosure = { owner }
        assert plainClosure() == this

        def nestedClosure = { ({ owner })() }
        assert nestedClosure() == nestedClosure
    }

}

new OwnerExample().run()

// ---------------------
// Usage of 'delegate' :
// ---------------------

class Person {

    String name

    def closure = { name }
}

def person = new Person(name: 'Some')
assert person.closure() == 'Some'

person.closure.delegate = new Person(name: 'Any')
assert person.closure() == 'Some'

person.closure.resolveStrategy = Closure.DELEGATE_ONLY
assert person.closure() == 'Any'