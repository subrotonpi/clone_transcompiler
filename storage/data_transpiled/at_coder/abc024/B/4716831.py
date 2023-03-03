def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import radians
    from math import log
    from math import log
    from math import log
    N = randint ( 1 , 100000 )
    T = randint ( 1 , 100000 )
    A = [ randint ( 1 , 100000 ) for _ in range ( N ) ]
    ans = T
    for i in range ( N - 1 ) :
        if A [ i + 1 ] - A [ i ] < T :
            ans += A [ i + 1 ] - A [ i ]
        elif A [ i + 1 ] - A [ i ] >= T :
            ans += T
    print ( ans )
