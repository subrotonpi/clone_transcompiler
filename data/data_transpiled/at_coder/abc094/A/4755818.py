def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.split ( sys.argv [ 1 ] )
        a , b , x = sc.split ( )
        if x < a :
            self.out.write ( "NO" )
        else :
            self.out.write ( "YES" if x - a <= b else "NO" )
