def main ( ) :
    import sys
    from random import randint
    sc = sys.stdin
    c = sc.read ( )
    sc.close ( )
    if c [ 3 ] - c [ 0 ] == c [ 4 ] - c [ 1 ] and c [ 3 ] - c [ 0 ] == c [ 5 ] - c [ 2 ] and c [ 6 ] - c [ 3 ] == c [ 7 ] - c [ 4 ] and c [ 6 ] - c [ 3 ] == c [ 8 ] - c [ 5 ] and c [ 1 ] - c [ 0 ] == c [ 4 ] - c [ 3 ] and c [ 1 ] - c [ 0 ] == c [ 7 ] - c [ 6 ] and c [ 2 ] - c [ 1 ] == c [ 5 ] - c [ 4 ] and c [ 2 ] - c [ 1 ] == c [ 8 ] - c [ 7 ] :
        print ( "Yes" )
    else :
        print ( "No" )
