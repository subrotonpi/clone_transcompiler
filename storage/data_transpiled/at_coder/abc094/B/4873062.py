def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    N = randint ( 1 , N )
    M = randint ( 1 , N )
    X = randint ( 1 , N )
    A = [ ]
    r = 0
    l = 0
    for i in range ( M ) :
        A.append ( sin ( i ) )
        if A [ i ] < X :
            l += 1
        else :
            r += 1
    ans = min ( r , l )
    print ( ans )
