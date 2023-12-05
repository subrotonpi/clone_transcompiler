def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        ans = ( a + b ) % 24
        sys.stdout.write ( ans )
