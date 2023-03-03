def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        sum = [ a [ 0 ] ]
        for i in range ( 1 , n ) :
            sum [ i ] = sum [ i - 1 ] + a [ i ]
        ans = sys.maxint
        for i in range ( n - 1 ) :
            x = sum [ i ]
            y = sum [ n - 1 ] - sum [ i ]
            ans = min ( ans , abs ( x - y ) )
        print ( ans )
