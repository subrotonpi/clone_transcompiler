def import import sys
import string
import string
class Main ( object ) :
    def __init__ ( self ) :
        self.data = string.split ( string.punctuation ) [ 0 ]
    def __str__ ( self ) :
        return string.split ( string.punctuation ) [ 0 ]
data = sys.stdin.read ( )
chars = [ ]
one = two = n = 0
chars.append ( data [ 0 ] )
for x in data :
    count = 0
    flag = 1
    for c in chars :
        if c == x :
            flag = 0
    if flag or n == 0 :
        chars.append ( x )
        for y in data :
            if x == y :
                count += 1
    two += count // 2
    one += count % 2
    n += 1
min_length = two
if one != 0 :
    min_length = two // one
min_length *= 2
if one > 0 :
    min_length += 1
print ( min_length )
