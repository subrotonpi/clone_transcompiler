def main ( ) :
    import sys
    from itertools import repeat
    from random import randint
    from itertools import chain
    from itertools import chain
    N = len ( chain ( [ 0 ] , repeat ( N ) ) )
    X = chain ( [ 0 ] , repeat ( N ) )
    x = [ X ]
    for i in range ( 1 , N + 1 ) :
        x.append ( chain ( [ i ] , repeat ( X ) ) )
    x.sort ( )
    dif = [ x [ i + 1 ] - x [ i ] for i in range ( N ) ]
    dif.sort ( )
    for i in range ( N - 1 ) :
        dif [ i + 1 ] = koyaku ( dif [ i ] , dif [ i + 1 ] )
    print ( dif [ N - 1 ] )
    def koyaku ( b , a ) :
        while True :
            mod = a % b
            if mod == 0 :
                return b
            a , b = b , mod
    return koyaku ( b , a )
