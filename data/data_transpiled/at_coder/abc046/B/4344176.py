def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        K = sc.readline ( ).strip ( )
        ans = K
        for i in range ( N - 1 ) :
            ans *= K - 1
        print ( ans )
