
// ---------------------
// Closure definitions :
// ---------------------

assert ({ return 1 })() == 1
assert ({ -> return 2 })() == 2
assert ({ return it })(3) == 3
assert ({ value -> return value })(4) == 4
assert ({ Integer value -> return value })(5) == 5

// ---------------
// Closure class :
// ---------------

assert ({ return 1 }) instanceof Closure