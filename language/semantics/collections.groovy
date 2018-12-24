
// --------------------
// Working with lists :
// --------------------

assert [1, 2, 3].collect { it + 1 } == [2, 3, 4]

assert [1, 2, 3].first() == 1
assert [1, 2, 3].last() == 3

assert [1, 2, 3].min() == 1
assert [1, 2, 3].max() == 3

assert [1, 2, 3].find { it > 1 } == 2
assert [1, 2, 3].findAll { it > 1 } == [2, 3]

assert [1, 2, 3].every { it < 4 }
assert [1, 2, 3].any { it > 2 }

assert [1, 2, 3].sum() == 6
assert ['a', 'b', 'c'].sum() == 'abc'

assert [1, 2, 3].join(':') == '1:2:3'

assert [1, 2, 3].inject('elements: ') { result, item -> result + item } == 'elements: 123'

assert ['a', 'b', 'c'].groupBy { it.size() } == [1 : ['a', 'b', 'c']]

// -------------------
// Working with maps :
// -------------------

def content = ''
['a': 1, 'b': 2, 'c': 3].eachWithIndex { key, value, index ->
    content += "$key:$value:$index"
}
assert content == 'a:1:0b:2:1c:3:2'

assert ['a': 1, 'b': 2, 'c': 3].find { it.value == 2 }.key == 'b'

assert ['a': 1, 'b': 2, 'c': 3].every { key, value -> value > 0 }
assert ['a': 1, 'b': 2, 'c': 3].any { key, value -> key == 'c' }