def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        for i in range ( 1000 ) :
            if N == i * i * i :
                print ( i )
                return
