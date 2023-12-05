def main ( ) :
    import sys
    import os
    from math import sin , cos , exp
    bf = sys.stdin.read ( )
    data = bf.split ( )
    N , K = [ int ( i ) for i in data [ 0 ].split ( ) ]
    h = [ sin ( i ) for i in range ( N ) ]
    h = [ sin ( i ) for i in h ]
    h = [ sin ( i ) for i in h ]
    min = h [ N - 1 ] - h [ 0 ]
    for i in range ( N - K + 1 ) :
        value = h [ i + K - 1 ] - h [ i ]
        if value < min :
            min = value
    print ( min )
