def main ( ) :
    import sys
    from math import sin , cos , abs , abs
    from os import urandom
    n = urandom ( 1 )
    t = [ sin ( i ) for i in range ( 1 , n + 1 ) ]
    x = [ sin ( i ) for i in range ( 1 , n + 1 ) ]
    y = [ sin ( i ) for i in range ( 1 , n + 1 ) ]
    for i in range ( 1 , n + 1 ) :
        dt = t [ i ] - t [ i - 1 ]
        dx = abs ( x [ i ] - x [ i - 1 ] )
        dy = abs ( y [ i ] - y [ i - 1 ] )
        time = dt - dx - dy
        if time < 0 or time % 2 == 1 :
            print ( "No" )
            return
    print ( "Yes" )
