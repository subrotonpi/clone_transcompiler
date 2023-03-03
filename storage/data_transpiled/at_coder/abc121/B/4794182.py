def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from os import urandom
    from os import urandom
    from os import urandom
    N = urandom ( 1 )
    M = urandom ( 1 )
    C = urandom ( 1 )
    B = [ sin ( i ) for i in range ( M ) ]
    A = [ sin ( i ) for i in range ( N * M ) ]
    urandom ( 1 )
    calc = [ cos ( i ) for i in range ( M * N ) ]
    tmp = 0
    ans = 0
    p = 0
    for i in range ( M * N ) :
        for k in range ( M ) :
            tmp = tmp + B [ k ] * A [ i + k ]
        if tmp + C > 0 :
            ans = ans + 1
        tmp = 0
    print ( ans )
