def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        k = sc.readline ( ).strip ( )
        s = sc.readline ( ).strip ( )
        cnt = 0
        for i in range ( 0 , k ) :
            for h in range ( 0 , k ) :
                if s - i - h <= k and s >= i + h :
                    cnt += 1
        print ( cnt )
