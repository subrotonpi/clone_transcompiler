def main ( ) :
    import sys
    import random
    from itertools import count
    n = [ random.randint ( 0 , 3 ) for i in range ( 3 ) ]
    n.sort ( )
    cnt = 0
    tmp = ( n [ 2 ] - n [ 0 ] ) / 2
    n [ 0 ] += tmp * 2
    cnt += tmp
    tmp = ( n [ 2 ] - n [ 1 ] ) / 2
    n [ 1 ] += tmp * 2
    cnt += tmp
    tmp = n [ 0 ] + n [ 1 ] - 2 * n [ 2 ] + 3
    cnt += tmp % 3
    print ( cnt )
