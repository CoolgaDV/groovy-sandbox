
// ---------------------
// Boolean expressions :
// ---------------------

assert true
assert ! false

// -------
// Lists :
// -------

assert [1, 2, 3]
assert ! []

// ------
// Maps :
// ------

assert ['one' : 1]
assert ! [:]

// ----------
// Matchers :
// ----------

assert ('a' =~ /a/)
assert ! ('b' =~ /a/)

// ---------
// Strings :
// ---------

assert ' '
assert ! ''

// ---------
// Numbers :
// ---------

assert 1
assert ! 0

// -------------------
// Object references :
// -------------------

assert new Object()
assert ! null

// -----------------------
// Custom implementation :
// -----------------------

class CustomType {

    String field

    def asBoolean() {
        field == 'some'
    }

}

assert new CustomType(field : 'some')
assert ! new CustomType(field : 'any')