def main ( ) :
    import sys
    def swap ( p , i , j ) :
        tmp = a [ j ]
        a [ j ] = tmp
    def swap ( p , i , j ) :
        for i in range ( M ) :
            if i != j :
                return False
        return True
    def swap ( p , i , j ) :
        tmp = a [ j ]
        a [ i ] = tmp
    dist = [ ]
    INF = 100_000_000
    for i in range ( N ) :
        for j in range ( N ) :
            if i != j :
                dist.append ( INF )
        for i in range ( M ) :
            dist [ edges [ i ] [ 0 ] ] [ edges [ i ] [ 1 ] ] = dist [ edges [ i ] [ 1 ] ] [ edges [ i ] [ 0 ] ] = edges [ i ] [ 2 ]
    cost = sum ( [ 0 for _ in range ( M ) ] )
    order = [ i for _ in range ( R ) ]
    while True :
        c = 0
        for i in range ( R - 1 ) :
            c += dist [ r [ order [ i ] ] ] [ r [ order [ i + 1 ] ] ]
        cost = min ( cost , c )
    print ( cost )
