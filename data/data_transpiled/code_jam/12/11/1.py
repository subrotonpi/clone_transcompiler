def main ( ) :
    import sys
    from math import sin , cos , pi
    f = open ( 'p.txt' , 'r' )
    s = f.readline ( )
    kases = int ( s )
    for kase in range ( 1 , kases + 1 ) :
        s = f.readline ( )
        f = s.split ( )
        A = int ( f [ 0 ] )
        B = int ( f [ 1 ] )
        s = f.readline ( )
        f = s.split ( )
        p = [ float ( i ) for i in f [ 0 ].split ( ) ]
        r = B + 2
        p2 = [ p [ 0 ] ]
        for i in range ( 1 , A ) :
            p2 [ i ] = p2 [ i - 1 ] * p [ i ]
        for bs in range ( A ) :
            t = p2 [ A - bs - 1 ] * ( 2 * bs + B - A + 1 ) + ( 1 - p2 [ A - bs - 1 ] ) * ( 2 * bs + B - A + B + 2 )
            if t < r :
                r = t
        print ( "Case #%d: %f" % ( kase , r ) )
