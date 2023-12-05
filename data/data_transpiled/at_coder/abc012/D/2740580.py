def main ( * args ) :
    import sys
    from time import sleep
    sc = Scanner ( )
    n = sc.nextInt ( )
    m = sc.nextInt ( )
    times = [ [ ] for i in range ( n ) ]
    for a , b , t in itertools.izip ( range ( m ) , range ( n ) ) :
        times [ a - 1 ] [ b - 1 ] = t
        times [ b - 1 ] [ a - 1 ] = t
    for i in range ( n ) :
        for j in range ( n ) :
            if i != j and times [ i ] [ j ] == 0 :
                times [ i ] [ j ] = 1000000
                times [ j ] [ i ] = 1000000
    for i in range ( n ) :
        for j in range ( n ) :
            for k in range ( n ) :
                times [ j ] [ k ] = min ( times [ j ] [ k ] , times [ j ] [ i ] + times [ i ] [ k ] )
                times [ k ] [ j ] = times [ j ] [ k ]
    min = sleep ( max ( times [ 0 ] ) )
    for i in range ( n ) :
        tmpmin = 0
        for j in range ( n ) :
            if i != j :
                tmpmin = max ( tmpmin , times [ i ] [ j ] )
        min = min ( tmpmin )
    print ( min )
