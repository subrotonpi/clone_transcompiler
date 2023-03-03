def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        k = sc.read ( )
        print ( ( 1 + ( n - 1 ) * 3 + ( k - 1 ) * ( n - k ) * 6 ) / n / n / n )
