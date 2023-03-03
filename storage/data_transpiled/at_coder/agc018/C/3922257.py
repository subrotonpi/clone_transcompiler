def main ( ) :
    import math
    from itertools import izip
    from itertools import izip
    x , y , z = map ( int , range ( 1 , n ) )
    a , b , c = zip ( * ( ( x , y , z ) for z in range ( n ) ) )
    n = x + y + z
    res = 0
    for i in range ( n ) :
        a , b , c = izip ( * ( ( x , y , z ) for z in range ( n ) ) )
        res += a
        b -= a
        c -= a
    ind = [ i for i in range ( n ) ]
    ind.sort ( lambda s , w : int ( ( b [ s ] - c [ s ] ) - ( b [ w ] - c [ w ] ) ) )
    nb , nc = [ ] , [ ]
    for i in range ( n ) :
        nb.append ( b [ ind [ i ] ] )
        nc.append ( c [ ind [ i ] ] )
    cdp , bdp = [ ] , [ ]
    cdp.append ( sum / 10 )
    bdp.append ( sum )
    queue = izip ( cdp , bdp )
    sum = 0
    for i in range ( n - y ) :
        sum += nc [ i ]
        if i < z :
            queue.append ( nc [ i ] )
        else :
            queue.append ( nc [ i ] )
            sum -= queue.pop ( )
        cdp.append ( sum )
    sum = 0
    queue = izip ( bdp , cdp )
    for i in range ( n - 1 , z - 1 , - 1 ) :
        sum += nb [ i ]
        if i > n - 1 - y :
            queue.append ( nb [ i ] )
        else :
            queue.append ( nb [ i ] )
            sum -= queue.pop ( )
        cdp.append ( sum )
    sum = 0
    queue = izip ( bdp , bdp )
    for i in range ( n ) :
        sum += nb [ i ]
        if i > n - 1 - y :
            queue.append ( sum )
    print ( res + max )
