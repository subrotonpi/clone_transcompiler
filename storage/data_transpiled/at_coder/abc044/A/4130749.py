def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        k = int ( sc.readline ( ) )
        k = min ( n , k )
        x = int ( sc.readline ( ) )
        y = int ( sc.readline ( ) )
        print ( k * x + ( n - k ) * y )
