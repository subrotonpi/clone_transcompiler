def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = sys.stdin.readline ( ).split ( ) [ 1 ]
        S = [ sc.readline ( ) for sc in range ( N ) ]
        m = { }
        for s in S :
            if s in m :
                v = m [ s ] + 1
            else :
                v = 1
            m [ s ] = v
        list_items = sorted ( m.items ( ) , key = lambda obj1 : obj2 [ 1 ] )
        print ( list_items [ 0 ] [ 0 ] )
