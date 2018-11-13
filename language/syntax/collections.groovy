
import java.util.concurrent.ConcurrentHashMap


println '-----------------'
println '>>> list classes:'
println '-----------------'

def defaultList = [1, 2, 3]
println defaultList.class

def linkedList = [1, 2, 3] as LinkedList
println linkedList.class


println '-------------------------'
println '>>> list elements access:'
println '-------------------------'

println defaultList[0]
println defaultList[3]
println defaultList[-1]
println defaultList[1..2]


println '-----------------------------'
println '>>> adding elements to lists:'
println '-----------------------------'

println defaultList
defaultList << 4
defaultList.add(5)
println defaultList


println '---------------'
println '>>> maps class:'
println '---------------'

def defaultMap = ['1': 'some', '2':'any']
println defaultMap.getClass()

def concurrentMap = ['1': 'some', '2':'any'] as ConcurrentHashMap
println concurrentMap.getClass()


println '-------------------------'
println '>>> maps elements access:'
println '-------------------------'

println defaultMap.'1'
println defaultMap['2']
println defaultMap[1]


println '-----------'
println '>>> arrays:'
println '-----------'

String[] stringArray = ['1', '2', '3']
println stringArray.class

def intArray = [1, 2, 3] as int[]
println intArray.class