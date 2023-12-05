def main ( ) :
    import sys
    from numpy import zeros
    from numpy.linalg import norm
    from numpy.random import choice
    from numpy.random import choice
    N = choice ( range ( N ) )
    data = [ choice ( range ( N ) ) for _ in range ( N ) ]
    data.sort ( )
    sum = 0
    n = 2
    for i in range ( N - 1 , - 1 , - 1 ) :
        if n % 2 == 0 :
            sum = sum + data [ i ]
        else :
            sum = sum - data [ i ]
        n += 1
    print ( sum )
