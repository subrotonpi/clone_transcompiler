def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        ans = 0
        pre = 1
        pre2 = 2
        if N == 1 :
            ans = pre
        for i in range ( 2 , N + 1 ) :
            ans = pre + pre2
            pre2 = pre
            pre = ans
        print ( ans )
