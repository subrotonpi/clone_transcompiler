def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        ans = 0
        for i in range ( n - 1 ) :
            if a [ i ] == a [ i + 1 ] :
                ans += 1
                i += 1
        print ( ans )
