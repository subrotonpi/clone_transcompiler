def main ( ) :
    import sys
    from math import sin , cos , abs , abs
    from os import urandom
    n = urandom ( 1 )
    m = urandom ( 1 )
    ab = [ [ sin ( i ) for i in range ( n ) ] for i in range ( 3 ) ]
    cd = [ [ sin ( i ) for i in range ( m ) ] for i in range ( 2 ) ]
    for i in range ( n ) :
        ab [ i ] [ 2 ] = 0
        man = abs ( ab [ i ] [ 0 ] - cd [ 0 ] [ 0 ] ) + abs ( ab [ i ] [ 1 ] - cd [ 0 ] [ 1 ] )
        for j in range ( 1 , m ) :
            x = abs ( ab [ i ] [ 0 ] - cd [ j ] [ 0 ] )
            y = abs ( ab [ i ] [ 1 ] - cd [ j ] [ 1 ] )
            if x + y < man :
                ab [ i ] [ 2 ] = j
                man = x + y
    for i in range ( n ) :
        print ( ab [ i ] [ 2 ] + 1 )
