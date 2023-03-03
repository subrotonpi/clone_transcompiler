def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    n = len ( chain ( [ 0 ] , repeat ( n ) ) )
    m = len ( chain ( [ 0 ] , repeat ( n ) ) )
    table = [ 0 ] * m
    for i in chain ( range ( n ) , repeat ( n ) ) :
        for k in chain ( range ( n ) , repeat ( n ) ) :
            for a in chain ( range ( n ) , repeat ( n ) ) :
                table [ a - 1 ] += 1
    count = 0
    for i in chain ( range ( m ) , repeat ( n ) ) :
        if table [ i ] == n :
            count += 1
    print ( count )
    sys.exit ( count )
