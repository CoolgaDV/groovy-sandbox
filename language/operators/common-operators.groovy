
// --------------------------------
// Arithmetic power operator (**) :
// --------------------------------

assert 2 ** 3 == 8

def some = 3
some **= 2
assert some == 9

// ---------------------
// Elvis operator (?:) :
// ---------------------

assert (null ?: 'unknown') == 'unknown'

// ---------------------
// Spread operator (*) :
// ---------------------

def strings = ['some', null, 'any']
assert strings*.size() == [4, null, 3]

def sum = { int first, int second ->
    first + second
}
def arguments = [1, 2]
assert sum(*arguments) == 3

def sublist = [2, 3]
def list = [1, *sublist, 4]
assert list == [1, 2, 3, 4]

def submap = [b: 2, c: 3]
def map = [a: 1, *:submap, d: 4]
assert map == [a:1, b: 2, c: 3, d: 4]

// ---------------------
// Range operator (..) :
// ---------------------

assert 0..2 == [0, 1, 2]

// --------------------------
// Spaceship operator (<=>) :
// --------------------------

assert (1 <=> 0) == 1
assert (1 <=> 1) == 0
assert (1 <=> 2) == -1

// --------------------------
// Membership operator (in) :
// --------------------------

def collection = [0, 1, 2]
assert 1 in collection

// --------------------------
// Identity operator (is) :
// --------------------------

def firstList = [0, 1, 2]
def secondList = [0, 1, 2]
assert firstList == secondList
assert ! firstList.is(secondList)

