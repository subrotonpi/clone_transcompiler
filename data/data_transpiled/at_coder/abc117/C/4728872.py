def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    sc = sys.stdin
    n = int ( sc.readline ( ) )
    m = int ( sc.readline ( ) )
    x = [ int ( i ) for i in repeat ( m ) ]
    x.sort ( )
    d = [ x [ i + 1 ] - x [ i ] for i in range ( m - 1 ) ]
    d.sort ( )
    res = 0
    for i in range ( m - n ) :
        res += d [ i ]
    print ( res )
