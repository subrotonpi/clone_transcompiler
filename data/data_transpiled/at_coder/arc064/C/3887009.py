def main ( ) :
    import numpy
    from numpy.linalg import norm
    with open ( '../data/dijkstra.txt' , 'r' ) as sc :
        x0 , y0 , x1 , y1 = sc.read ( ).split ( )
    res = numpy.zeros ( ( n , ) , dtype = numpy.int )
    res [ start ] = 0
    ju = numpy.zeros ( ( n + 1 , ) , dtype = numpy.bool )
    for j in range ( n ) :
        cur = - 1
        for i in range ( n ) :
            if ju [ i ] :
                cur = i
        if cur == 0 :
            continue
        dist = res + gra [ cur ]
        if dist [ i ] > dist [ j ] :
            dist [ i ] = dist [ j ]
    dist = numpy.zeros ( ( n + 2 , n + 2 ) , dtype = numpy.float )
    for i in range ( n ) :
        for j in range ( n ) :
            d = numpy.sqrt ( ( a [ i ] - a [ j ] ) ** 2 + ( b [ i ] - b [ j ] ) ** 2 ) - r [ i ] - r [ j ]
            d = numpy.maximum ( d , 0 )
            dist [ i ] = d
    for i in range ( n ) :
        dist [ i ] = numpy.sqrt ( ( a [ i ] - x0 ) ** 2 + ( b [ i ] - y0 ) ** 2 ) - r [ i ]
        dist [ i ] = dist [ i ]
        dist [ i ] = dist [ i ]
        dist [ i ] = numpy.sqrt ( ( a [ i ] - x1 ) ** 2 + ( b [ i ] - y1 ) ** 2 ) - r [ i ]
        dist [ i ] = dist [ i ]
        dist [ i ] = dist [ i ]
        dist [ i ] = dist [ i ]
    dist [ n + 1 ] = numpy.sqrt ( ( x0 - x1 ) ** 2 + ( y0 - y1 ) ** 2 ) - r [ i ]
    return dist
