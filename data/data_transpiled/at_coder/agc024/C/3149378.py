def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        A = [ sc.readline ( ).strip ( ) for i in range ( 1 , n + 1 ) ]
        print ( help ( n , A ) )
    def help ( n , A ) :
        for i in range ( 1 , n + 1 ) :
            if A [ i ] > i - 1 :
                return - 1
        for i in range ( 1 , n - 1 ) :
            if A [ i ] < A [ i + 1 ] - 1 :
                return - 1
        ans = 0
        ans += A [ n ]
        for i in range ( n - 1 , 1 , - 1 ) :
            if A [ i ] + 1 == A [ i + 1 ] :
                continue
            ans += A [ i ]
        return ans
