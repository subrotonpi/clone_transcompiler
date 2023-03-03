def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        ans = 0
        for i in range ( N ) :
            ans += i + 1
        print ( ans )
