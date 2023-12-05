def main ( ) :
    import math
    from numpy import pi
    from numpy.core import zeros
    from numpy.core import sin , cos , pi
    N = len ( sys.argv )
    radius = [ sin ( i ) for i in range ( N ) ]
    pi = math.pi
    area = 0
    for i in range ( N ) :
        radius.append ( sin ( i ) )
    radius = [ sin ( i ) for i in range ( N - 1 , - 1 , - 1 ) ]
    for i in range ( N - 1 , - 1 , - 1 ) :
        if N % 2 == 0 :
            if i % 2 == 0 :
                area -= pi * radius [ i ] ** 2
            elif i % 2 == 1 :
                area += pi * radius [ i ] ** 2
        if N % 2 == 1 :
            if i % 2 == 0 :
                area += pi * radius [ i ] ** 2
            elif i % 2 == 1 :
                area -= pi * radius [ i ] ** 2
    print ( area )
