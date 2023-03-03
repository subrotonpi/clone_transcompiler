def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        for i in range ( 2 , N ) :
            if N % i == 0 :
                print ( "NO" )
                return
        print ( "YES" )
