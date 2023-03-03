def main ( ) :
    import sys
    from numpy.linalg import norm
    from numpy.random import rand
    from numpy.random import seed
    seed ( 1 )
    N = rand ( )
    K = rand ( )
    seed ( 2 )
    l = float ( K - 1 ) / float ( N )
    m = float ( 1 ) / float ( N )
    u = float ( N - K ) / float ( N )
    ans = l * m * u ** 6 + m ** 3 + m ** 3 * l ** 3 + m ** 2 * m
    print ( ans )
