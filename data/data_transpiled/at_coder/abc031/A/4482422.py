def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        d = sc.read ( )
        print ( max ( ( a + 1 ) * d , a * ( d + 1 ) ) )
