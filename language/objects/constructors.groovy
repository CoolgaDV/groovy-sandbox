// ----------------------------------
// Constructor with named arguments :
// ----------------------------------

class Person {
    String name
    int age
}

def person = new Person(name: 'Some', age: 42)

assert person.name == 'Some'
assert person.age == 42