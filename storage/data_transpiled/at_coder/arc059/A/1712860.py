def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        a.sort ( )
        start = a [ 0 ]
        end = a [ - 1 ]
        sum = sys.maxint
        for i in range ( start , end + 1 ) :
            ans = 0
            for j in range ( N ) :
                ans += ( a [ j ] - i ) * ( a [ j ] - i )
            sum = min ( sum , ans )
        print ( sum )
