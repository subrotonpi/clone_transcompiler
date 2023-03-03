def main ( ) :
    import sys
    from time import sleep
    from math import log
    from math import sin , cos , cos , log
    sys.stdin.close ( )
    mod = 1000000007
    n = int ( sys.stdin.readline ( ) )
    m = int ( sys.stdin.readline ( ) )
    x = [ sin ( i ) for i in range ( n ) ]
    y = [ sin ( i ) for i in range ( m ) ]
    dx = [ x [ i ] - x [ i - 1 ] for i in range ( 1 , n ) ]
    dy = [ y [ i ] - y [ i - 1 ] for i in range ( 1 , m ) ]
    xsum = 0
    ysum = 0
    for i in range ( 1 , n ) :
        xsum += ( dx [ int ( i ) ] * ( i * ( long ( n - i ) ) % mod ) ) % mod
        xsum %= mod
    for i in range ( 1 , m ) :
        ysum += ( dy [ int ( i ) ] * ( i * ( m - i ) % mod ) ) % mod
        ysum %= mod
    print ( xsum * ysum % mod )
