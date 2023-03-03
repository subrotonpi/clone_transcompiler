def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        max = a [ 0 ]
        min = a [ 0 ]
        for i in range ( N ) :
            if max < a [ i ] :
                max = a [ i ]
        for i in range ( N ) :
            if min > a [ i ] :
                min = a [ i ]
        print ( max - min )
