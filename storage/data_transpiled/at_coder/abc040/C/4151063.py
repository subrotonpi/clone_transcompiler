def main ( ) :
    import sys
    from math import fabs
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    N = pi.count ( 'N' )
    a = pi.split ( ' ' )
    dp = pi.split ( ' ' )
    dp [ 1 ] = abs ( a [ 1 ] - a [ 0 ] )
    for i in range ( 2 , N ) :
        dp [ i ] = min ( dp [ i - 1 ] + abs ( a [ i ] - a [ i - 1 ] ) , dp [ i - 2 ] + abs ( a [ i ] - a [ i - 2 ] ) )
    print ( dp [ N - 1 ] )
