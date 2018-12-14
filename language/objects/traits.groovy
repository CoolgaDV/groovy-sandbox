// ---------------
// Trait example :
// ---------------

trait SampleTrait {

    private String someString = 'some'
    int someInt
    public boolean someFlag

    String provideInfo() {
        "$someString : $someInt : $someFlag"
    }

}

class SampleClass implements SampleTrait { }

def instance = new SampleClass()
instance.someInt = 10
instance.@SampleTrait__someFlag = true

assert instance.provideInfo() == 'some : 10 : true'

// -----------------
// Multiple traits :
// -----------------

trait FirstTrait {

    def doFirst() {
        'first'
    }

}

trait SecondTrait {

    def doSecond() {
        'second'
    }

}

class ClassWithBothTraits implements FirstTrait, SecondTrait { }

instance = new ClassWithBothTraits()
assert "${instance.doFirst()}, ${instance.doSecond()}" == 'first, second'

// --------------------------
// Trait methods overriding :
// --------------------------

trait TraitWithMethod {

    def doSomething() {
        'some'
    }

}

class ClassOverridingTraitMethod {

    def doSomething() {
        'any'
    }

}

assert new ClassOverridingTraitMethod().doSomething() == 'any'

// -------------------
// Dynamic behaviour :
// -------------------

trait TraitWithDynamicBehaviour {

    def methodMissing(String methodName, args) {
        "$methodName : ${args.join(':')}"
    }

    def propertyMissing(String propertyName) {
        "property : $propertyName"
    }

}

class ClassWithDynamicTrait implements TraitWithDynamicBehaviour { }

instance = new ClassWithDynamicTrait()
assert instance.someMethod(1, 'abc') == 'someMethod : 1:abc'
assert instance.someProperty == 'property : someProperty'

// ------------------------
// Runtime implementation :
// ------------------------

trait SomeTrait {

    def doSomething() {
        'some'
    }

}

instance = new Object() as SomeTrait
assert instance.doSomething() == 'some'

// --------------------
// Chaining behaviour :
// --------------------

trait FinalHandler {

    def handle(String message) {
        "$message final"
    }

}

trait FirstHandler {

    def handle(String message) {
        super.handle("$message first")
    }

}

trait SecondHandler {

    def handle(String message) {
        super.handle("$message second")
    }

}

class FirstComplexClass implements FinalHandler, FirstHandler, SecondHandler { }

class SecondComplexClass implements FinalHandler, SecondHandler, FirstHandler { }

assert new FirstComplexClass().handle('some') == 'some second first final'
assert new SecondComplexClass().handle('any') == 'any first second final'