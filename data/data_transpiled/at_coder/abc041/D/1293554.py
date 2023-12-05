def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.number
        M = sc.number
        x = [ ]
        y = [ ]
        edge = [ [ ] for i in range ( N ) ]
        for i in range ( M ) :
            x.append ( sc.number - 1 )
            y.append ( sc.number - 1 )
            edge [ x [ i ] ].append ( y [ i ] )
        dp = [ 1 ] * int ( math.pow ( 2 , N ) )
        for i in range ( 1 , int ( math.pow ( 2 , N ) ) ) :
            for j in range ( N ) :
                if ( i & ( 1 << j ) ) :
                    flg = True
                    for k in range ( N ) :
                        if ( i & ( 1 << k ) ) and k in edge [ j ] :
                            flg = False
        print ( dp [ int ( math.pow ( 2 , N ) ) - 1 ] )
