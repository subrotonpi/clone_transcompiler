def main ( ) :
    import sys
    from numpy.polynomial.polyutils import polyutils
    class Main ( object ) :
        def solver ( self ) :
            with open ( "../gamma.txt" , "r" ) as f :
                N = f.read ( )
                K = f.read ( )
                w = [ [ ] for _ in range ( N ) ]
                for i in range ( N ) :
                    for j in range ( N ) :
                        w [ i ] [ j ] = f.read ( )
            sum = [ ]
            for i in range ( ( 1 << N ) - 1 , 1 , - 1 ) :
                s = 0
                for j in range ( N ) :
                    if ( ( i >> j ) & 1 ) == 1 :
                        for k in range ( j + 1 , N ) :
                            if ( ( i >> k ) & 1 ) == 1 :
                                s += w [ j ] [ k ]
                sum.append ( s )
            dp = [ ]
            dp.append ( - sum [ 0 ] / 4 )
            dp.append ( 0 )
            for i in range ( 1 , ( 1 << N ) ) :
                dp.append ( K )
                for j in range ( ( i - 1 ) & i , 1 , - 1 ) :
                    if sum [ i ] < sum [ i ^ j ] + sum [ j ] :
                        raise AssertionError ( sum [ i ] , sum [ i ^ j ] , sum [ j ] , pow ( i , j ) )
                    dp [ i ] = max ( dp [ i ] , dp [ i ^ j ] - sum [ i ] + sum [ i ^ j ] + sum [ j ] + sum [ j ] )
            print ( dp [ ( 1 << N ) - 1 ] )
    return Main
