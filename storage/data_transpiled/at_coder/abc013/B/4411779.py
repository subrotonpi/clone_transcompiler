def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        m = sc.read ( )
        print ( min ( min ( abs ( n - m ) , abs ( n + 10 - m ) ) , abs ( m + 10 - n ) ) )
