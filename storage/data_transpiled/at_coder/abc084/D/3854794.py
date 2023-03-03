def primes ( max ) :
    import random
    from numpy.core import primes
    p = [ True ] * ( max + 1 )
    p [ 0 ] = False
    p [ 1 ] = False
    for i in range ( 2 , i * max + 1 ) :
        if p [ i ] :
            for j in range ( 2 , i * max + 1 ) :
                p [ i * j ] = False
    return p
