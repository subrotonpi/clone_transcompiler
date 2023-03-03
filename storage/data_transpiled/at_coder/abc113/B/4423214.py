def main ( ) :
    import sys
    from math import fabs
    from math import sin , cos
    from math import sin , cos
    from math import sin , cos
    n = int ( sys.argv [ 1 ] )
    t = int ( sys.argv [ 2 ] )
    a = int ( sys.argv [ 3 ] )
    min = 999
    minidx = 0
    for i in range ( n ) :
        sa = abs ( a - ( t - sin ( t ) * 0.006 ) )
        if min > sa :
            min = sa
            minidx = i
    print ( minidx + 1 )
