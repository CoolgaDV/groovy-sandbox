
println '-----------------'
println '>>> method names:'
println '-----------------'

def 'some function'() {
    println 'some function call'
}

'some function'()


println '----------------'
println '>>> map entries:'
println '----------------'

def map = [:]
map.'some key' = 'some value'

println map.'some key'