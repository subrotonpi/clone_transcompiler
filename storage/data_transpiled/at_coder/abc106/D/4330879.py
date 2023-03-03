def main ( ) :
    import sys
    from numpy import array
    from numpy.core import dot
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import choice
    from numpy.random import choice
    from numpy.linalg import solve
    from numpy.random import choice
    from numpy.random import choice
    n , m , q = choice ( range ( n ) )
    lr = [ [ choice ( i ) for i in range ( m ) ] for i in range ( range ( n ) ) ]
    pq = [ [ choice ( i ) for i in range ( q ) ] for i in range ( range ( n ) ) ]
    board = zeros ( n + 2 )
    for i in range ( m ) :
        board [ lr [ i ] [ 1 ] ] [ lr [ i ] [ 0 ] ] += 1
    for y in range ( 1 , n + 1 ) :
        for x in range ( 1 , n + 1 ) :
            board [ y ] [ x ] += board [ y - 1 ] [ x ] + board [ y ] [ x - 1 ] - board [ y - 1 ] [ x - 1 ]
    for i in range ( q ) :
        print ( query ( pq [ i ] [ 0 ] , pq [ i ] [ 1 ] , board ) )
    def query ( p , q , board ) :
        return board [ q ] [ q ] - board [ q ] [ p - 1 ] - board [ p - 1 ] [ q ] + board [ p - 1 ] [ p - 1 ]
    def debug ( * os ) :
        print ( " ".join ( map ( str , os ) ) , file = sys.stderr )
    def main ( ) :
        return solve ( )
    return main
