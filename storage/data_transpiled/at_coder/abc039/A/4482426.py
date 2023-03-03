def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        c = sc.read ( )
        ans = ( a * b ) ** 2 + ( b * c ) ** 2 + ( c * a ) ** 2
        print ( ans )
