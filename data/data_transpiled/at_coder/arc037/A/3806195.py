def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        m = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        ans = 0
        for i in range ( N ) :
            if m [ i ] < 80 :
                ans += 80 - m [ i ]
        print ( ans )
