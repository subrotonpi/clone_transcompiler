def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        sum = 0
        for i in range ( 1 , N + 1 ) :
            sum += 10000 * i
        ans = int ( sum ) / N
        print ( ans )
