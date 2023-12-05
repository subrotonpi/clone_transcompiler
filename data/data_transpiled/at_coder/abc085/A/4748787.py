def import import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.Scanner ( string.punctuation )
        s = sc.next ( )
        str = s.split ( )
        str [ 3 ] = '8'
        print ( str )
