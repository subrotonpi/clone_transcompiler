def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    R , C , K , N = count ( ) , count ( ) , count ( )
    p = [ [ ] for _ in range ( N ) ]
    row = [ 0 ] * ( R + 1 )
    col = [ 0 ] * ( C + 1 )
    row [ 0 ] = 0
    col [ 0 ] = 0
    for i in range ( N ) :
        r , c = next ( ) , next ( )
        p [ i ] [ 0 ] = r
        p [ i ] [ 1 ] = c
        row [ r ] += 1
        col [ c ] += 1
    sys.stdout.write ( "\n" )
    row1 = [ 0 ] * 100000 + [ 1 ]
    col1 = [ 0 ] * 100000 + [ 1 ]
    for i in range ( 1 , R + 1 ) :
        row1 [ row [ i ] ] += 1
    for i in range ( 1 , C + 1 ) :
        col1 [ col [ i ] ] += 1
    cnt = 0
    for i in range ( 0 , K ) :
        cnt += row1 [ i ] * col1 [ K - i ]
    for i in range ( N ) :
        if row [ p [ i ] [ 0 ] ] + col [ p [ i ] [ 1 ] ] == K :
            cnt -= 1
        elif row [ p [ i ] [ 0 ] ] + col [ p [ i ] [ 1 ] ] == K + 1 :
            cnt += 1
    print ( cnt )
