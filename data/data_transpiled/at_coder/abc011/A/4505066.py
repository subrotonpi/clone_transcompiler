def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        N = sc.read ( )
        if N == 12 :
            print ( 1 )
        else :
            print ( N + 1 )
