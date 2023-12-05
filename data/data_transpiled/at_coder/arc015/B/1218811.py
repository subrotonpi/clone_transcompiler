def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        min = [ float ( x ) for x in sc.readline ( ).strip ( ).split ( ',' ) ]
        max = [ float ( x ) for x in sc.readline ( ).strip ( ).split ( ',' ) ]
        a = [ 0 ] * 6
        for i in range ( N ) :
            if max [ i ] >= 35 :
                a [ 0 ] += 1
            elif max [ i ] >= 30 :
                a [ 1 ] += 1
            elif max [ i ] >= 25 :
                a [ 2 ] += 1
            elif max [ i ] < 0 :
                a [ 5 ] += 1
            if min [ i ] >= 25 :
                a [ 3 ] += 1
            if min [ i ] < 0 and max [ i ] >= 0 :
                a [ 4 ] += 1
        print ( a [ 0 ] , a [ 1 ] , a [ 2 ] , a [ 3 ] , a [ 4 ] , a [ 5 ] )
