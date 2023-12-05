def main ( ) :
    import os
    import numpy
    from numpy.linalg import norm
    from numpy.random import uniform
    N = uniform ( 0 , 1 )
    K = uniform ( 0 , 1 )
    R = [ norm ( x ) for x in range ( N ) ]
    R = [ norm ( x ) for x in R ]
    rate = 0
    for i in range ( N - K , N ) :
        rate = ( rate + R [ i ] ) / 2D
    print ( rate )
