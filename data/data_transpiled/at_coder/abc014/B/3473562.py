def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    n = len ( sys.stdin.readline ( ) )
    X = sys.stdin.readline ( )
    a = [ ]
    bit = [ ]
    sum = 0
    for i in range ( n ) :
        a.append ( sys.stdin.readline ( ) )
    for i in range ( n - 1 , - 1 , - 1 ) :
        bit.append ( X % 2 )
        X = X / 2
    for i in range ( n ) :
        if bit [ i ] == 1 :
            sum += a [ n - 1 - i ]
    print ( sum )
