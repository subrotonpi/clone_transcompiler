def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , log
    from math import log
    from math import log
    from math import log
    from math import log
    N = randint ( 1 , N + 1 )
    A = [ log ( x ) for x in range ( N + 1 ) ]
    B = [ log ( x ) for x in range ( N + 1 ) ]
    print ( sum ( A ) )
    cnt = 0
    for i in range ( N , 1 , - 1 ) :
        r = A [ i ] % B [ i ]
        if r != 0 :
            cnt += B [ i ] - r
        A [ i - 1 ] += cnt
    print ( cnt )
