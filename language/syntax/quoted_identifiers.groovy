
// --------------
// Method names :
// --------------

def 'some function'() {
    'some function call'
}

assert 'some function'() == 'some function call'

// -------------
// Map entries :
// -------------

def map = [:]
map.'some key' = 'some value'

assert map.'some key' == 'some value'