def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    from itertools import count
    N = len ( sys.stdin.readline ( ) )
    M = sys.stdin.readline ( ).rstrip ( '\n' )
    A = [ ]
    sum = [ count ( ) for i in range ( 1 , N + 1 ) ]
    sum.append ( 0 )
    for i in range ( 1 , N + 1 ) :
        sum [ i ] = sum [ i - 1 ] + A [ i ]
    d = defaultdict ( int )
    for i in range ( 0 , N ) :
        key = sum [ i ] % M
        if key in d :
            d [ key ] = d [ key ] + 1
        else :
            d [ key ] = 1
    ans = 0
    for value in d.values ( ) :
        if value > 1 :
            ans += value * ( value - 1 ) / 2
    print ( ans )
