def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        N = sc.read ( )
        print ( int ( math.ceil ( N / 2 ) ) )
