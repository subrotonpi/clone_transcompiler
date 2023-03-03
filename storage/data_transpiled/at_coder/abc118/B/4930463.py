def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    N = randint ( 1 , 31 )
    M = randint ( 1 , 31 )
    liked = [ ]
    for i in chain ( N , M ) :
        for K in range ( K ) :
            for A in chain ( A , N ) :
                liked.append ( A )
    res = 0
    for i in chain ( range ( 31 ) , N ) :
        if liked [ i ] == N :
            res += 1
    print ( res )
