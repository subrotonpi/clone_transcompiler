def _main ( ) :
    import sys
    from itertools import chain
    from itertools import chain
    sc = _raw_input
    N = len ( sys.stdin )
    K = len ( sys.stdin )
    sc.readline ( )
    s = sc.readline ( ).split ( )
    n = [ int ( i ) for i in s ]
    pq = chain ( [ ( i + 1 , n [ i ] ) for i in range ( N ) ] , [ ] )
    f = sys.stdout
    for i in range ( N ) :
        pq.append ( chain ( * pq ) )
    f.flush ( )
