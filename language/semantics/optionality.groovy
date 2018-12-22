
// ----------------------
// Optional parentheses :
// ----------------------

def max = Math.max 1, 2

assert max == 2

// -------------------------
// Optional return keyword :
// -------------------------

def function() {
    'some value'
}

assert function() == 'some value'

// -------------------------
// Optional public keyword :
// -------------------------

class Some {

    def any() {
        'any'
    }

}

assert new Some().any() == 'any'