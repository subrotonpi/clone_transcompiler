def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        m = sc.readline ( ).strip ( )
        INF = 1_000_000_000
        d = [ [ INF for i in range ( n ) ] for j in range ( n ) if i != j ]
        for a , b , t in itertools.combinations ( range ( m ) , 2 ) :
            d [ a - 1 ] [ b - 1 ] = t
            d [ b - 1 ] [ a - 1 ] = t
        for k in range ( n ) :
            for i in range ( n ) :
                for j in range ( n ) :
                    if d [ i ] [ j ] > d [ i ] [ k ] + d [ k ] [ j ] :
                        d [ i ] [ j ] = d [ i ] [ k ] + d [ k ] [ j ]
    ans = INF
    for i in range ( n ) :
        ans = 0
        for j in range ( n ) :
            ans = max ( ans , d [ i ] [ j ] )
        ans = min ( ans , ans )
    print ( ans )
