def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        if len ( a ) > len ( b ) :
            print ( a )
        else :
            print ( b )
