def main ( ) :
    import sys
    from math import sin , cos
    from math import log
    from math import pi
    from math import log
    N = pi
    K = pi
    map = [ 0 ]
    for i in range ( 1 , N + 1 ) :
        map [ i ] = sin ( pi * map [ i - 1 ] )
    ans = 0
    for i in range ( 0 , N - K ) :
        ans += map [ i + K ] - map [ i ]
    sys.stdout.write ( ans )
