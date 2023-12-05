def main ( ) :
    import sys
    from numpy import arange
    from numpy.core import zeros
    from numpy.core import amax
    from numpy.core import minimum , maximum , maximum , max
    n = int ( sys.stdin.readline ( ) )
    a = zeros ( n )
    for i in range ( n ) :
        a [ i ] = min ( a )
    max = - 100000
    for i in range ( n ) :
        bmax = - 100000
        amax = - 100000
        for j in range ( n ) :
            ap = bp = 0
            if i != j :
                for k in range ( min ( i , j ) , max ( i , j ) + 1 ) :
                    if ( k - min ( i , j ) ) % 2 == 0 :
                        ap += a [ k ]
                    else :
                        bp += a [ k ]
            if bp > bmax :
                bmax = bp
                amax = ap
        max = max ( max , amax )
    print ( max )
