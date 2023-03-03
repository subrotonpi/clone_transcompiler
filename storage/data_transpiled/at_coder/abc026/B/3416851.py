def main ( args ) :
    import math
    from numpy import pi
    from numpy.core import zeros
    from numpy.core import sin
    from numpy.core import cos
    from numpy.core import sin
    from numpy.core import cos
    from numpy.core import sin
    from numpy.core import cos
    n = len ( args )
    r = [ sin ( x ) for x in args ]
    r.sort ( )
    ans = 0
    for i in range ( len ( r ) - 1 , - 1 , - 1 ) :
        if i % 2 == ( len ( r ) - 1 ) % 2 :
            ans += pow ( r [ i ] , 2 )
        else :
            ans -= pow ( r [ i ] , 2 )
    ans *= pi
    print ( ans )
