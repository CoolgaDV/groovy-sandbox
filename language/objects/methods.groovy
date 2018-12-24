
// -----------------------------
// Method with named arguments :
// -----------------------------

def callWithNamedArguments(Map arguments) {
    arguments
}

assert callWithNamedArguments(name: 'Some', age: 42) == [name: 'Some', age: 42]

// -------------------------------
// Method with default arguments :
// -------------------------------

def methodWithDefaultArguments(String name, Integer age = 42) {
    "$name $age"
}

assert methodWithDefaultArguments('Some') == 'Some 42'
assert methodWithDefaultArguments('Any', 77) == 'Any 77'