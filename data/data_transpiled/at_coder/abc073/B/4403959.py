def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        ans = 0
        for i in range ( N ) :
            c = sc.readline ( ).strip ( )
            r = sc.readline ( ).strip ( )
            ans += r - c + 1
        print ( ans )
