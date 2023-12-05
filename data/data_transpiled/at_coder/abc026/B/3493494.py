def main ( ) :
    import math
    from numpy import pi
    from numpy.core import zeros
    from numpy.core import sin , pi
    from numpy.core import sin , cos , pi
    sc = zeros ( ( N , N ) )
    R = [ sin ( i ) for i in range ( N ) ]
    sc.close ( )
    R = [ sin ( i ) for i in R ]
    r2 = 0
    flag = 1
    for i in range ( len ( R ) - 1 , - 1 , - 1 ) :
        if flag :
            r2 += R [ i ] ** 2
        else :
            r2 -= R [ i ] ** 2
        flag = not flag
    print ( r2 * pi )
