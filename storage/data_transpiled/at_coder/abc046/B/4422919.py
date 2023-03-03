def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        a = int ( sc.readline ( ) )
        n -= 1
        ans = a
        for i in range ( n ) :
            ans *= ( a - 1 )
        print ( ans )
