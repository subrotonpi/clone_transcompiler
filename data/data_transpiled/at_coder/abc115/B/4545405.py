def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    from itertools import chain
    n = len ( chain ( * repeat ( sys.argv [ 1 : ] ) ) )
    p = chain ( [ 1 ] , repeat ( sys.argv [ 1 : ] ) )
    sum = 0
    for i in chain ( n , repeat ( sys.argv [ 1 : ] ) ) :
        p.append ( i )
        sum += p [ i ]
    p.sort ( )
    sum -= p [ - 1 ] / 2
    print ( sum )
    sys.exit ( sum )
