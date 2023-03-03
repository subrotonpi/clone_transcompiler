def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , log
    from math import log
    from math import log
    from math import log
    from math import log
    N = randint ( 1 , N )
    D = log ( 1 , D )
    X = log ( 1 , X )
    A = [ ]
    for i in range ( N ) :
        A.append ( log ( i ) )
    print ( A )
    sum = 0
    for i in range ( N ) :
        if A [ i ] == 1 :
            sum += D
        elif D / A [ i ] >= 1 :
            sum += ( D / A [ i ] ) + 1
            if D % A [ i ] == 0 :
                sum -= 1
        elif D / A [ i ] == 0 :
            sum += 1
    sum += X
    print ( sum )
