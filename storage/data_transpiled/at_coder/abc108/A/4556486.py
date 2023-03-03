def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        k = sc.readline ( ).strip ( )
        ans = 0
        for i in range ( 1 , k ) :
            ans += ( k - i + 1 ) / 2
        print ( ans )
