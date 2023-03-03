def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        a = [ int ( i ) for i in sc.readline ( ).split ( ) ]
        sum = 0
        for i in range ( n ) :
            sum += a [ i ] - 1
        print ( sum )
        sc.close ( )
