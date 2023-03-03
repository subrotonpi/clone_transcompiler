def main ( * args ) :
    import sys
    from random import randint
    from math import sin
    from math import ceil
    from math import log
    n = randint ( 1 , n )
    m = randint ( 1 , n )
    x = randint ( 1 , n )
    f = - 1
    a = [ - 3 ] * ( m + 1 )
    for i in range ( 1 , m + 1 ) :
        a [ i ] = randint ( 1 , n )
        if a [ i - 1 ] < x and a [ i ] > x :
            f = i
    print ( min ( f - 1 , m - f + 1 ) )
