def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import rand
    from numpy.random import choice
    sc = rand ( )
    f = open ( 'w' , 'r' )
    N , M , Q = sc.shape
    m = [ [ ] for i in range ( N ) ]
    for s in sc.split ( ) :
        for j in range ( M ) :
            m [ s [ j ] ].append ( s [ j ] == '1' )
    hc = [ [ ] for i in range ( N + 1 ) ]
    vc = [ [ ] for i in range ( N + 1 ) ]
    t = [ [ ] for i in range ( N + 1 ) ]
    for i in range ( N ) :
        for j in range ( M ) :
            hd = ( 1 if ( i > 0 and m [ i - 1 ] [ j ] and m [ i ] [ j ] ) else 0 )
            vd = ( 1 if ( j > 0 and m [ i ] [ j - 1 ] and m [ i ] [ j ] ) else 0 )
            hc [ i ] [ j + 1 ] = ( hc [ i ] [ j ] + hd )
            vc [ i + 1 ] [ j ] = ( vc [ i ] [ j ] + vd )
            t [ i + 1 ] [ j + 1 ] = t [ i ] [ j + 1 ] + t [ i + 1 ] [ j ] - t [ i ] [ j ] + ( m [ i ] [ j ] and 1 ) - hd - vd
    for x1 , y1 , x2 , y2 in eigs ( m , N , M , N , Q ) :
        ans = t [ x2 ] [ y2 ] - t [ x1 ] [ y2 ] - t [ x2 ] [ y1 ] + t [ x1 ] [ y1 ] + vc [ x2 ] [ y1 ] - t [ x1 ] [ y2 ] + t [ x1 ] [ y1 ] - t [ y1 ] [ x2 ] + t [ x1 ] [ y1 ] - t [ y1 ] [ x2 ] + t [ x1 ] [ y2 ] - t [ y1 ] [ x2 ] + t [ y1 ] [ y2 ] - t [ x1 ] [ y1 ]
        f.write ( ans )
