def main ( ) :
    import numpy
    from numpy.linalg import norm
    from numpy.random import randint
    from numpy.random import uniform
    from numpy.random import uniform
    from numpy.random import uniform
    N , K = uniform ( 0 , 1 )
    w = uniform ( 0 , N )
    p = uniform ( 0 , N )
    s = [ ]
    left , right = 0.d , 100.d
    while abs ( right - left ) > 1e-9 :
        mid = ( left + right ) / 2
        for i in range ( N ) :
            s.append ( w [ i ] * ( p [ i ] - mid ) )
        s = sorted ( s )
        r = 0.d
        for i in range ( N - K , N ) :
            r += s [ i ]
        if norm ( r ) > 0.d :
            left = mid
        else :
            right = mid
    print ( right )
