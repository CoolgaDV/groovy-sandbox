
def value = 'some value'


println '---------------------'
println 'single-quoted string:'
println '---------------------'

def singleQuotedString = 'single-quoted string'
println singleQuotedString
println singleQuotedString.class


println '-------------------------------'
println 'double-quoted string (GString):'
println '-------------------------------'

def doubleQuotedString = "double-quoted string: $value ${1 + 2}"
println doubleQuotedString
println doubleQuotedString.class


println '--------------------------------'
println '>>> triple single-quoted string:'
println '--------------------------------'

def tripleSingleQuotedString = '''\
  Triple
  Single\
  Quoted
  
  String\
'''.stripIndent()
println tripleSingleQuotedString
println tripleSingleQuotedString.class


println '--------------------------------'
println '>>> triple double-quoted string:'
println '--------------------------------'

def tripleDoubleQuotedString = """\
  Double
  Single\
  Quoted
  
  String $value ${1 + 2}\
""".stripIndent()
println tripleDoubleQuotedString
println tripleDoubleQuotedString.class


println '------------------'
println '>>> slashy string:'
println '------------------'

def slashyString = /\
  \Slashy
  
  \String $value ${1 + 2}\
/.stripIndent()
println slashyString
println slashyString.class


println '-------------------------'
println '>>> dollar-slashy string:'
println '-------------------------'

def dollarSlashyString = $/\
  /Dollar
  /Slashy
  
  /String $value ${1 + 2}\
/$.stripIndent()
println dollarSlashyString
println dollarSlashyString.class


println '--------------------------------'
println '>>> interpolation with closures:'
println '--------------------------------'

def variable = 5
def closureInterpolatedString = "variable is: ${ -> variable }"

println closureInterpolatedString

variable = 10

println closureInterpolatedString