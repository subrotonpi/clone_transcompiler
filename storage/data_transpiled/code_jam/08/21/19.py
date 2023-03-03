def main ( args ) :
    import sys
    class A ( object ) :
        def __call__ ( self , * args ) :
            return ( args )
    ans = lambda cin : cin ( )
    n = cin ( )
    A = cin ( )
    B = cin ( )
    C = cin ( )
    D = cin ( )
    x = [ cin ( ) for _ in range ( n ) ]
    y = [ cin ( ) for _ in range ( n ) ]
    M = cin ( )
    count = [ 0 ] * 9
    count [ int ( x [ 0 ] % 3 * 3 + y [ 0 ] % 3 ) ] += 1
    for i in range ( 1 , n ) :
        x [ i ] = ( A * x [ i - 1 ] + B ) % M
        y [ i ] = ( C * y [ i - 1 ] + D ) % M
        count [ int ( x [ i ] % 3 * 3 + y [ i ] % 3 ) ] += 1
    ret = 0
    for i in range ( 9 ) :
        for j in range ( i , 9 ) :
            for k in range ( j , 9 ) :
                if ( i // 3 + j // 3 + k // 3 ) % 3 == 0 and ( i % 3 + j % 3 + k % 3 ) % 3 == 0 :
                    if i == j and j == k :
                        ret += count [ i ] * ( count [ j ] - 1 ) * ( count [ k ] - 2 ) / 6
                    elif i == j :
                        ret += count [ i ] * ( count [ j ] - 1 ) / 2 * count [ k ]
                    elif j == k :
                        ret += count [ i ] * count [ j ] * ( count [ k ] - 1 ) / 2
                    else :
                        ret += count [ i ] * count [ j ] * count [ k ]
    return ret
