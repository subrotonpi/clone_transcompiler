def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    n = len ( sys.stdin.readline ( ) )
    l = [ chain ( [ i ] , i ) for i in range ( 2 * n ) ]
    l.sort ( )
    sum = 0
    for i in range ( n ) :
        sum += l [ 2 * i ]
    print ( sum )
