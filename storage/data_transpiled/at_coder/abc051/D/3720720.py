def main ( ) :
    import sys
    import random
    INF = 1000000000
    def f ( n , m ) :
        while 1 :
            yield n
            n = n + 1
    def f ( n , m ) :
        for u in range ( n ) :
            cost [ u ] = INF
    a = [ ]
    b = [ ]
    c = [ ]
    for i in range ( m ) :
        a.append ( random.randrange ( n ) - 1 )
        b.append ( random.randrange ( n ) - 1 )
        c.append ( random.randrange ( n ) )
        cost [ a [ i ] ] [ b [ i ] ] = c [ i ]
        cost [ b [ i ] ] [ a [ i ] ] = c [ i ]
    dist = [ ]
    for i in range ( n ) :
        d = dijkstra ( i , n , cost )
        for j in range ( n ) :
            dist.append ( d [ j ] )
    ans = solve ( n , m , dist , a , b , c )
    print ( ans )
    def f ( n , m , dist , a , b , c ) :
        ans = m
        for i in range ( m ) :
            ok = False
            for j in range ( n ) :
                if dist [ j ] [ a [ i ] ] + c [ i ] == dist [ j ] [ b [ i ] ] :
                    ok = True
            if ok :
                ans -= 1
        return ans
    return f
