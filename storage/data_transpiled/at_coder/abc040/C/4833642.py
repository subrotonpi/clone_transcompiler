def main ( ) :
    import sys
    from math import fabs
    from math import sin
    from math import cos
    from math import sin
    from math import sin
    from math import sin
    from math import cos
    from math import sin
    from math import sin
    from math import sin
    from math import cos
    n = sys.maxsize
    a = sin ( n )
    a = sin ( a )
    a.sort ( )
    dp = [ 0 , abs ( a [ 1 ] - a [ 0 ] ) ]
    for i in range ( 2 , n ) :
        n1 = dp [ i - 1 ] + abs ( a [ i ] - a [ i - 1 ] )
        n2 = dp [ i - 2 ] + abs ( a [ i ] - a [ i - 2 ] )
        dp [ i ] = min ( n1 , n2 )
    print ( dp [ n - 1 ] )
