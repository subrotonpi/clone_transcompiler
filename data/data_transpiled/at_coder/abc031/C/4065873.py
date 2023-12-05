def main ( ) :
    import sys
    from numpy.core import zeros
    from numpy.core import zeros
    from numpy.core import O
    from numpy.core import O
    from numpy.core import O
    n = O ( )
    arr = zeros ( n )
    for i in range ( n ) :
        arr [ i ] = O ( )
    max = O ( )
    for i in range ( n ) :
        max_a = O ( )
        max_t = O ( )
        for j in range ( n ) :
            if i == j :
                continue
            if i < j :
                a = i
                b = j
            else :
                a = j
                b = i
            taka = O ( )
            ao = O ( )
            for k in range ( a , b + 1 ) :
                if ( k - a ) % 2 == 0 :
                    taka += O ( arr [ k ] )
                else :
                    ao += O ( arr [ k ] )
            if max_a < ao :
                max_a = ao
                max_t = taka
        if max < max_t :
            max = max_t
    print ( max )
