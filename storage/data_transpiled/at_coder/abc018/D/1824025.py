def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    n , m , p , q , r = count ( )
    mat = [ [ 0 for i in range ( n ) ] for _ in range ( r ) ]
    for x , y , z in chain ( range ( n ) , repeat ( p ) , repeat ( q ) , repeat ( r ) ) :
        del mat [ x ] [ y ]
        del mat [ x ] [ y ]
    ans = 0
    for s in range ( 1 << n ) :
        if sum ( s ) != p :
            continue
        a = [ 0 for i in range ( m ) ]
        for i in range ( m ) :
            for j in range ( n ) :
                if ( ( s >> j ) & 1 ) :
                    a [ i ] += mat [ j ] [ i ]
        a = [ x for x in a if x > q ]
        tmp = 0
        for i in range ( q ) :
            tmp += a [ - 1 - i ]
        ans = max ( ans , tmp )
    print ( ans )
    def tr ( * args ) :
        print ( chain ( * args ) )
    return tr
