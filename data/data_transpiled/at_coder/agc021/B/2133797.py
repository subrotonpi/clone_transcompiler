def main ( ) :
    import math
    import numpy
    from numpy.testing.utils import get_platform
    import numpy.testing.utils as npt
    n = len ( sys.argv )
    x = range ( n )
    y = range ( n )
    for i in range ( n ) :
        angle = [ ]
        p = 0
        for j in range ( n ) :
            if j != i :
                angle.append ( math.atan2 ( y [ j ] - y [ i ] , x [ j ] - x [ i ] ) )
        angle.sort ( )
        angle.append ( angle [ 0 ] + 2 * math.pi )
        max = 0
        for j in range ( len ( angle ) ) :
            max = max ( max , angle [ j + 1 ] - angle [ j ] )
        max = max ( max - math.pi , 0.0 )
        print ( "%.15f\n" % ( max / ( 2 * math.pi ) ) )
