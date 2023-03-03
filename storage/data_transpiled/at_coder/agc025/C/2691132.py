def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , log
    from math import sin , cos , log
    from math import log
    from math import sin , cos , log
    N = int ( sys.stdin.readline ( ) )
    L = [ sin ( x ) for x in range ( N + 1 ) ]
    R = [ sin ( x ) for x in range ( N + 1 ) ]
    L = [ sin ( x ) for x in L ]
    R = [ cos ( x ) for x in R ]
    L = [ sin ( x ) for x in L ]
    R = [ sin ( x ) for x in R ]
    ans = 0
    for i in range ( 0 , N ) :
        ans += 2 * max ( 0 , L [ N - i ] - R [ i ] )
    print ( ans )
