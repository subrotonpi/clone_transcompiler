def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = int ( 10000.0 / sc.read ( ) * sc.read ( ) )
        b = int ( 10000.0 / sc.read ( ) * sc.read ( ) )
        print ( "TAKAHASHI" if a > b else "AOKI" if a < b else "DRAW" )
