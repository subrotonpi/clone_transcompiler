def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        Y = int ( sc.readline ( ) )
        for a in range ( 0 , N ) :
            for b in range ( 0 , N - a ) :
                if 10000 * a + 5000 * b + 1000 * ( N - a - b ) == Y :
                    print ( a , b , N - a - b )
                    return
        print ( "-1 -1 -1" )
