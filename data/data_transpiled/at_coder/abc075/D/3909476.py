def main ( ) :
    import sys
    from numpy import arange
    from numpy.linalg import norm
    from numpy.random import choice
    N = int ( N )
    K = int ( K )
    x = [ choice ( N ) for _ in range ( N ) ]
    y = [ choice ( N ) for _ in range ( N ) ]
    xx = [ x [ i ] for i in range ( N ) ]
    yy = [ y [ i ] for i in range ( N ) ]
    xx.sort ( )
    yy.sort ( )
    ans = sum ( [ x [ i ] for i in range ( N ) ] )
    for x1 in range ( N ) :
        for x2 in range ( x1 + 1 ) :
            for y1 in range ( N ) :
                for y2 in range ( y1 + 1 ) :
                    count = 0
                    lx = xx [ x1 ]
                    rx = xx [ x2 ]
                    by = yy [ y1 ]
                    ty = yy [ y2 ]
                    for i in range ( N ) :
                        if x [ i ] >= lx and x [ i ] <= rx and y [ i ] >= by and y [ i ] <= ty :
                            count += 1
                    if count >= K :
                        ans = min ( ans , ( rx - lx ) * ( ty - by ) )
    print ( ans )
