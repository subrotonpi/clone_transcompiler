def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        if a + b < 24 :
            print ( a + b )
        else :
            print ( ( a + b ) % 24 )
