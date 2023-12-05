def main ( ) :
    import sys
    from random import randint
    sc = randint ( 1 , 3 )
    c = [ [ ] for i in range ( 3 ) for j in range ( 3 ) ]
    ok = True
    for i in range ( 1 , 2 ) :
        if c [ 0 ] [ i ] - c [ 0 ] [ i - 1 ] != c [ 1 ] [ i ] - c [ 1 ] [ i - 1 ] or c [ 0 ] [ i ] - c [ 0 ] [ i - 1 ] != c [ 2 ] [ i ] - c [ 2 ] [ i - 1 ] :
            ok = False
    for i in range ( 1 , 2 ) :
        if c [ i ] [ 0 ] - c [ i - 1 ] [ 0 ] != c [ i ] [ 1 ] - c [ i - 1 ] [ 1 ] or c [ i ] [ 0 ] - c [ i - 1 ] [ 0 ] != c [ i ] [ 2 ] - c [ i - 1 ] [ 2 ] :
            ok = False
    print ( ok and "Yes" or "No" )
