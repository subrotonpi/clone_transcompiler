def Main ( ) :
    global n , d , k
    l , r , s , t , a = [ ] , [ ] , [ ] , [ ] , [ ]
    b = [ False for i in range ( d ) ]
    for i in range ( d ) :
        l.append ( i )
        r.append ( i )
    for i in range ( k ) :
        b [ i ] = ( s [ i ] < ( t [ i ] ) )
    for i in range ( d ) :
        for j in range ( k ) :
            if l [ i ] <= s [ j ] <= r [ i ] :
                s [ j ] = max ( s [ j ] , r [ i ] ) if b [ j ] else min ( s [ j ] , l [ i ] )
                if ( b [ j ] >= t [ j ] ) and a [ j ] == 0 :
                    a [ j ] = i + 1
    return [ a [ i ] for i in range ( d ) ]
