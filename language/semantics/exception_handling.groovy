// ----------------
// Multi catching :
// ----------------

String invokeInSafeWay(Closure function) {
    try {
        function.call()
    } catch (NullPointerException | IllegalArgumentException ex) {
        return 'specific exception'
    } catch (Exception ex) {
        return 'common exception'
    }
}

assert invokeInSafeWay { throw new NullPointerException() } == 'specific exception'
assert invokeInSafeWay { throw new IllegalArgumentException() } == 'specific exception'
assert invokeInSafeWay { throw new RuntimeException() } == 'common exception'