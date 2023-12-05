def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        T = sc.readline ( ).strip ( )
        tn = [ ]
        for i in range ( N ) :
            tn.append ( sc.readline ( ).strip ( ) )
        ans = T
        for i in range ( 1 , N ) :
            if tn [ i ] - tn [ i - 1 ] > T :
                ans += T
            else :
                ans += tn [ i ] - tn [ i - 1 ]
        print ( ans )
        sc.close ( )
