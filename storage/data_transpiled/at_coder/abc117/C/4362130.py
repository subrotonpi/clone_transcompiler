def import import sys
import string
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            sc = sys.stdin
        except :
            print ( "out" )
            return
        n , m = map ( int , sys.stdin.readline ( ).split ( ) )
        x = [ int ( i ) for i in sc.readline ( ).split ( ) ]
        x.sort ( )
        d = [ x [ i + 1 ] - x [ i ] for i in range ( m - 1 ) ]
        d.sort ( )
        ans = 0
        for i in range ( m - n ) :
            ans = ans + d [ i ]
        print ( ans )
