def import import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        b = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        count = 0
        for i in range ( N ) :
            for k in range ( i , N ) :
                for j in range ( k , N ) :
                    s = abs ( ( a [ j ] - a [ i ] ) * ( b [ k ] - b [ i ] ) - ( a [ k ] - a [ i ] ) * ( b [ j ] - b [ i ] ) )
                    if s != 0 and s % 2 == 0 :
                        count += 1
        print ( count )
