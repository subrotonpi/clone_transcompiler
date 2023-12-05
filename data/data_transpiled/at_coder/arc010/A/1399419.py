def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , cos , log
    from math import log
    N = randint ( 1 , 10000 )
    M = randint ( 1 , 10000 )
    A = randint ( 1 , 10000 )
    B = randint ( 1 , 10000 )
    ans = 0
    for i in range ( M ) :
        if N <= A :
            N += B
        c = log ( N )
        if N < c :
            ans = i + 1
            break
        else :
            N -= c
    if ans :
        print ( ans )
    else :
        print ( "complete" )
