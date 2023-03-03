def main ( ) :
    import sys
    from itertools import repeat
    reader = open ( sys.argv [ 1 ] )
    N = reader.read ( )
    K = reader.read ( )
    h = repeat ( N )
    h = [ i for i in range ( N ) ]
    h.sort ( )
    min = h [ N - 1 ] - h [ 0 ]
    for i in range ( N - K + 1 ) :
        gap = h [ i + K - 1 ] - h [ i ]
        if min > gap :
            min = gap
    sys.stdout.write ( min )
