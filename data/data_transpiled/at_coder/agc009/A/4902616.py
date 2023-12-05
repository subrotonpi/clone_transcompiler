def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        a = [ [ sc.readline ( ) , sc.readline ( ) ] ]
        [ ai , ai ] = a
        ans = 0
        for i in range ( n - 1 , - 1 , - 1 ) :
            if ( a [ i ] [ 0 ] + ans ) % a [ i ] [ 1 ] != 0 :
                ans += a [ i ] [ 1 ] - ( ( a [ i ] [ 0 ] + ans ) % a [ i ] [ 1 ] )
        print ( ans )
        sc.close ( )
