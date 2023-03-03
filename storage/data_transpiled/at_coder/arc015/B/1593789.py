def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        max = [ float ( x ) for x in sc.readline ( ).strip ( ).split ( ',' ) ]
        min = [ float ( x ) for x in sc.readline ( ).strip ( ).split ( ',' ) ]
        ans = [ 0 ] * 6
        for i in range ( N ) :
            if max [ i ] >= 35 :
                ans [ 0 ] += 1
            elif max [ i ] >= 30 :
                ans [ 1 ] += 1
            elif max [ i ] >= 25 :
                ans [ 2 ] += 1
            elif max [ i ] < 0 :
                ans [ 5 ] += 1
            if min [ i ] >= 25 :
                ans [ 3 ] += 1
            elif min [ i ] < 0 and max [ i ] >= 0 :
                ans [ 4 ] += 1
        print ( ans [ 0 ] , ans [ 1 ] , ans [ 2 ] , ans [ 3 ] , ans [ 4 ] , ans [ 5 ] )
