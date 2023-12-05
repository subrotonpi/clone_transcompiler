def main ( ) :
    import sys
    from itertools import repeat
    sc = sys.stdin
    c = [ [ sc.randint ( 0 , 3 ) for i in range ( 3 ) ] for j in range ( 3 ) ]
    for i in range ( 3 ) :
        for j in range ( 3 ) :
            c [ i ] [ j ] = sc.randint ( 0 , 3 )
    for i in range ( 3 ) :
        for j in range ( 3 ) :
            c [ i ] [ 2 - j ] -= c [ i ] [ 0 ]
    if c [ 0 ] [ 1 ] == c [ 1 ] [ 1 ] and c [ 0 ] [ 1 ] == c [ 2 ] [ 1 ] and c [ 0 ] [ 2 ] == c [ 1 ] [ 2 ] and c [ 0 ] [ 2 ] == c [ 2 ] [ 2 ] :
        print ( "Yes" )
    else :
        print ( "No" )
