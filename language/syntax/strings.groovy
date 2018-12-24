
def value = 'some value'

// ----------------------
// Single-quoted string :
// ----------------------

assert 'single-quoted string'.class == String

// --------------------------------
// Double-quoted string (GString) :
// --------------------------------

assert "double-quoted string: $value ${1 + 2}" instanceof GString

// -----------------------------
// Triple single-quoted string :
// -----------------------------

assert '''\
  Triple
  Single\
  Quoted
  
  String\
'''.class == String

// -----------------------------
// Triple double-quoted string :
// -----------------------------

assert """\
  Double
  Single\
  Quoted
  
  String $value ${1 + 2}\
""" instanceof GString

// ---------------
// Slashy string :
// ---------------

def slashyString = /\
  \Slashy
  
  \String $value ${1 + 2}\
/
assert slashyString instanceof GString

// ----------------------
// Dollar-slashy string :
// ----------------------

def dollarSlashyString = $/\
  /Dollar
  /Slashy
  
  /String $value ${1 + 2}\
/$
assert dollarSlashyString instanceof GString

// -----------------------------
// Interpolation with closures :
// -----------------------------

def variable = 5
def closureInterpolatedString = "variable is: ${ -> variable }"

assert closureInterpolatedString == 'variable is: 5'

variable = 10

assert closureInterpolatedString == 'variable is: 10'