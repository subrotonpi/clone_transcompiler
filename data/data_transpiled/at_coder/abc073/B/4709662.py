def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        count = 0
        for i in range ( N ) :
            l = int ( sc.readline ( ) )
            r = int ( sc.readline ( ) )
            count += r - l + 1
        print ( count )
