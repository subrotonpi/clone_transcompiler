def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    from itertools import repeat
    from itertools import chain
    q = len ( sys.stdin.readline ( ) )
    p = [ True ] * 100001
    p [ 0 ] = False
    p [ 1 ] = False
    s = [ False ] * 100001
    sum = [ 0 ] * 100001
    for i in range ( 2 , 100000 + 1 ) :
        sum [ i ] += sum [ i - 1 ]
        if p [ i ] :
            for j in range ( 2 * i , 100000 + 1 , i ) :
                p [ j ] = False
            if p [ ( i + 1 ) / 2 ] :
                s [ i ] = True
                sum [ i ] += 1
    lines = [ ]
    for i in range ( q ) :
        l , r = chain ( range ( 1 , l + 1 ) , repeat ( s [ l ] - sum [ l - 1 ] , s [ l ] ) )
        lines.append ( '{}\n'.format ( sum [ r ] - sum [ l - 1 ] ) )
    print ( ''.join ( lines ) )
    sys.stdout.flush ( )
