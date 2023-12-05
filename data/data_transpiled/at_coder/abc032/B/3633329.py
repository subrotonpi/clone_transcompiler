def import import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.split ( sys.stdin )
        self.set = set ( )
        s = sc.split ( )
        k = int ( sc.split ( ) [ 0 ] )
        for i in range ( 0 , len ( s ) - k ) :
            p = s [ i : i + k ]
            self.set.add ( p )
    print ( len ( self.set ) )
