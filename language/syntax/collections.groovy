
import java.util.concurrent.ConcurrentHashMap

def list = [1, 2, 3]
def map = ['1': 'some', '2':'any']

// --------------
// List classes :
// --------------

assert list.class == ArrayList
assert (list as LinkedList).class == LinkedList

// ----------------------
// List elements access :
// ----------------------

assert list[0] == 1
assert list[3] == null
assert list[-1] == 3
assert list[1..2] == [2, 3]

// --------------------------
// Adding elements to lists :
// --------------------------

list << 4
list.add(5)
assert list == [1, 2, 3, 4, 5]

// ------------
// Maps class :
// ------------

assert map.getClass() == LinkedHashMap
assert (map as ConcurrentHashMap).getClass() == ConcurrentHashMap

// ----------------------
// Maps elements access :
// ----------------------

assert map.'1' == 'some'
assert map['2'] == 'any'
assert map['1'] == 'some'

// --------
// Arrays :
// --------

String[] stringArray = ['1', '2', '3']
assert stringArray.class == String[]

assert ([1, 2, 3] as int[]).class == int[]