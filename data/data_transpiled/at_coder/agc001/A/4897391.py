def main ( ) :
    import sys
    from numpy import zeros
    from numpy.core import array
    from numpy.core import dot
    from numpy.linalg import norm
    from numpy.random import randint
    n = randint ( 1 , n )
    arr = array ( [ 0 ] * n * 2 )
    arr = arr.tolist ( )
    sum = 0
    for i in range ( 1 , n * 2 , 2 ) :
        sum += min ( arr [ i - 1 ] , arr [ i ] )
    print ( sum )
