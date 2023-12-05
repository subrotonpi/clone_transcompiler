def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import rand
    n = rand ( n )
    m = rand ( n )
    x = rand ( n )
    y = rand ( n )
    z = rand ( n )
    mm = [ [ ] for i in range ( 8 ) ]
    for i in range ( n ) :
        for j in range ( 8 ) :
            kk = 0
            if ( j & 4 ) == 0 :
                kk += x [ i ]
            else :
                kk -= x [ i ]
            if ( j & 2 ) == 0 :
                kk += y [ i ]
            else :
                kk -= y [ i ]
            if ( j & 1 ) == 0 :
                kk += z [ i ]
            else :
                kk -= z [ i ]
            mm [ j ].append ( kk )
    ans = 0
    for i in range ( 8 ) :
        [ tmp , tmp ] = 0
        for j in range ( m ) :
            tmp += mm [ i ] [ n - j - 1 ]
        ans = max ( ans , tmp )
    print ( ans )
