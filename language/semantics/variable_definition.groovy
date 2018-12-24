
// ---------------------
// Multiple assignment :
// ---------------------

def (a, b, c) = [1, 2, 3]
assert a == 1 && b == 2 && c == 3

def (d, e, f) = [4, 5]
assert d == 4 && e == 5 && f == null

// ----------------------
// Object destructuring :
// ----------------------

class Person {

    String name
    int age

    def getAt(int index) {
        switch (index) {
            case 0: return name
            case 1: return age
            default: throw new IllegalArgumentException()
        }
    }
}

def person = new Person(name: 'some', age: 42)
def (name, age) = person
assert name == 'some' && age == 42