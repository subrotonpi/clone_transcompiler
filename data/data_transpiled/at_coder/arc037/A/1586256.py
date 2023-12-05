def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        ans = 0
        m = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        for i in range ( N ) :
            if m [ i ] >= 80 :
                continue
            ans += 80 - m [ i ]
        print ( ans )
