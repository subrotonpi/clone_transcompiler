def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        K = sc.readline ( ).strip ( )
        A = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        cnt = [ 0 ] * ( N + 1 )
        for i in range ( N ) :
            cnt [ A [ i ] ] += 1
        cnt.sort ( )
        sum = 0
        for i in range ( K ) :
            sum += cnt [ N - i ]
        print ( N - sum )
