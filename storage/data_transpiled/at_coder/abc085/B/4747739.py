def main ( ) :
    import sys
    from itertools import count
    n = int ( sys.stdin.readline ( ) )
    data = [ ]
    group = [ 0 ] * 101
    sum = 0
    for i in range ( n ) :
        data [ i ] = count ( data [ i ] )
        group [ data [ i ] ] += 1
    for i in range ( 101 ) :
        if group [ i ] > 0 :
            sum += 1
    print ( sum )
