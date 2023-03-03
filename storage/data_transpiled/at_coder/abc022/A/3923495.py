def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        S = sc.readline ( ).strip ( )
        T = sc.readline ( ).strip ( )
        W = sc.readline ( ).strip ( )
        A = [ 0 ] + [ 0 ] * N
        wht = W
        ans = 0
        for i in A :
            wht += i
            if wht >= S and wht <= T :
                ans += 1
        print ( ans )
