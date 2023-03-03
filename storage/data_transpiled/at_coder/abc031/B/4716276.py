def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , cos , log
    from math import log
    from math import log
    L = randint ( 1 , L )
    H = randint ( 1 , H )
    N = randint ( 1 , N )
    A = [ sin ( i ) for i in range ( N ) ]
    for i in range ( N ) :
        if L <= A [ i ] <= H :
            print ( 0 )
        elif A [ i ] < L :
            print ( L - A [ i ] )
        elif A [ i ] > H :
            print ( - 1 )
