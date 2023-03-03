def main ( ) :
    import sys
    import random
    from numpy.linalg import eigs
    from numpy.random import rand
    from numpy.random import randint
    from numpy.random import rand
    N = rand ( )
    C = rand ( )
    D = [ rand ( ) for i in range ( 1 , C + 1 ) ]
    c = [ rand ( ) for i in range ( 1 , N + 1 ) ]
    color_nums = [ rand ( ) for i in range ( 1 , C + 1 ) ]
    color_nums [ c [ i ] [ j ] ] [ ( i + j ) % 3 ] += 1
    min_dsum = sum ( [ min ( color_nums [ i ] [ j ] * D [ i ] [ j ] , ( i + j ) % 3 ) for j in range ( 1 , C + 1 ) ] )
    for c1 in range ( 1 , C + 1 ) :
        for c2 in range ( 1 , C + 1 ) :
            if c1 == c2 :
                continue
            for c3 in range ( 1 , C + 1 ) :
                if c1 == c3 or c2 == c3 :
                    continue
                tmp = 0
                for c_org in range ( 1 , C + 1 ) :
                    tmp += color_nums [ c_org ] [ 0 ] * D [ c_org ] [ c1 ]
                    tmp += color_nums [ c_org ] [ 1 ] * D [ c_org ] [ c2 ]
                    tmp += color_nums [ c_org ] [ 2 ] * D [ c_org ] [ c3 ]
                min_dsum = min ( min_dsum , tmp )
    out = min ( min_dsum , rand ( ) )
