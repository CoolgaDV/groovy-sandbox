
// ------------------
// Working with XML :
// ------------------

def xml = '''
<person>
    <name>some</name>
    <age>42</age>
    <interests>
        <interest>books</interest>
        <interest>movies</interest>
    </interests>
</person>
'''

def person = new XmlSlurper().parseText(xml)

assert person.name == 'some'
assert person.age == 42
assert person.interests.interest.size() == 2
assert person.interests.interest[0] == 'books'
assert person.interests.interest[1] == 'movies'