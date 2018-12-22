
import java.util.regex.Pattern
import java.util.regex.Matcher

// ------------------------
// Create pattern operator:
// ------------------------

def pattern = ~/some/
assert pattern instanceof Pattern

// ------------------------
// Create Matcher operator:
// ------------------------

def matcher = 'some text' =~ /some/
assert matcher instanceof Matcher
assert matcher.find()

// ---------------
// Match operator:
// ---------------

def match = 'other text' ==~ /other.*/
assert match instanceof Boolean
assert match