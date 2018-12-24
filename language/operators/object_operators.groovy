
// --------------------------
// Safe navigation operator :
// --------------------------

class Person { String name }

Person person = new Person(name: 'some')
assert person?.name == 'some'

person = null
assert person?.name == null

// ---------------------
// Direct field access :
// ---------------------

class Location {

    public String address

    String getAddress() {
        "address: $address"
    }

}

Location location = new Location(address: 'some')
assert location.address == 'address: some'
assert location.@address == 'some'

// -------------------
// Method references :
// -------------------

String string = 'some string'
Closure<String> reference = string.&toUpperCase
assert reference() == 'SOME STRING'