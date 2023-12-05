def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        a = [ sc.read ( ) for i in range ( 3 * N ) ]
        a.sort ( )
        ans = 0
        for i in range ( 1 , N + 1 ) :
            ans += a [ 3 * N - 2 * i ]
        print ( ans )
