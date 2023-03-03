def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def execute ( self ) :
        sc = sys.stdin
        ( N , Ma , Mb ) = sc.readline ( ).split ( ' ' )
        dp = [ [ ] for i in range ( 0 , N + 1 ) for j in range ( 0 , N ) for k in range ( 0 , N ) ]
        dp [ 0 ] [ 0 ] = 0
        for i in range ( 1 , N + 1 ) :
            ai , bi , ci = sc.readline ( ).split ( ' ' )
            for j in range ( 0 , N ) :
                for k in range ( 0 , N ) :
                    if dp [ i - 1 ] [ j ] [ k ] == sys.maxint :
                        continue
                    dp [ i ] [ j ] [ k ] = min ( dp [ i - 1 ] [ j ] [ k ] , dp [ i ] [ j ] [ k ] )
                    dp [ i ] [ j + ai ] [ k + bi ] = min ( dp [ i - 1 ] [ j ] [ k ] + ci , dp [ i ] [ j + ai ] [ k + bi ] )
        min_cost = sys.maxint
        for j in range ( 1 , N ) :
            for k in range ( 1 , N ) :
                if j * Mb == k * Ma :
                    min_cost = min ( min_cost , dp [ N ] [ j ] [ k ] )
        if min_cost == sys.maxint :
            min_cost = - 1
        print ( min_cost )
        sc.close ( )
