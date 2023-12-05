def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        print ( int ( math.ceil ( ( a + b ) / 2 ) ) )
