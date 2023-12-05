def main ( ) :
    import sys
    from numpy import array
    from numpy.core import zeros
    from numpy.core import dot
    from numpy.random import randint
    N = randint ( 1 , N )
    K = shape ( N )
    values = [ dot ( N , i ) for i in range ( N ) ]
    values = [ i for i in values if i != 0 ]
    values = [ min ( values [ i ] ) for i in range ( N - K + 1 ) ]
    min = sum ( values )
    for i in range ( N - K + 1 ) :
        min = min ( values [ i + K - 1 ] - values [ i ] , min )
    print ( min )
