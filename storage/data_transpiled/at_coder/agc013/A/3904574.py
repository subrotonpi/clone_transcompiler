def main ( ) :
    import sys
    from random import randint
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    N = randint ( 1 , N )
    A = [ log ( x ) for x in range ( N ) ]
    ans = 1
    d = 0
    for i in range ( 1 , N ) :
        if d == 0 :
            if A [ i - 1 ] < A [ i ] :
                d = 1
            elif A [ i - 1 ] > A [ i ] :
                d = - 1
        elif d > 0 :
            if A [ i - 1 ] > A [ i ] :
                ans += 1
                d = 0
        elif d < 0 :
            if A [ i - 1 ] < A [ i ] :
                ans += 1
                d = 0
    print ( ans )
