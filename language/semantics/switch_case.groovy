
// -------------
// Switch case :
// -------------

def switchCase(source) {
    switch (source) {
        case 'some': return 1
        case [1, 2, 3]: return 2
        case 4..6: return 3
        case Date: return 4
        case ~/^an.?/: return 5
        case { it > 10}: return 6
    }
}

assert switchCase('some') == 1
assert switchCase(3) == 2
assert switchCase(5) == 3
assert switchCase(new Date()) == 4
assert switchCase('any') == 5
assert switchCase(11) == 6