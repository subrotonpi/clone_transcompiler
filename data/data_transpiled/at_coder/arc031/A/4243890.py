def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        for i in range ( len ( s ) / 2 + 1 ) :
            if s [ i ] != s [ - i - 1 ] :
                print ( "NO" )
                return
        print ( "YES" )
