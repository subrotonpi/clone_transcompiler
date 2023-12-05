def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        c = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        ans = 0
        for i in range ( N ) :
            s = 0
            for j in range ( N ) :
                if c [ i ] % c [ j ] == 0 and i != j :
                    s += 1
            if s % 2 == 0 :
                ans += ( s + 2.0 ) / ( 2 * s + 2.0 )
            else :
                ans += 0.5
        print ( ans )
