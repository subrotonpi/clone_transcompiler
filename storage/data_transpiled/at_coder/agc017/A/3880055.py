def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from math import log
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    N = randint ( 1 , N )
    P = randint ( 1 , P )
    A = [ ]
    odd = False
    for i in range ( N ) :
        A.append ( randint ( 1 , P ) )
        if A [ i ] % 2 == 1 :
            odd = True
    ans = 1
    if odd :
        for i in range ( N - 1 ) :
            ans *= 2
        print ( ans )
    else :
        if P == 1 :
            print ( 0 )
        else :
            for i in range ( N ) :
                ans *= 2
            print ( ans )
