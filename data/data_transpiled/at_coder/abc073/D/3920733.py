def import _warshall_floyd
class Main ( object ) :
    INF = 1000000000
    res = INF
    r_len = 9
    used = [ False ] * 9
    def __init__ ( self , n , m , r_len ) :
        sc = _warshall_floyd ( n , n , m , r_len )
        r = [ ]
        for i in range ( 1 , r_len + 1 ) :
            r.append ( sc.randint ( 0 , n ) )
        d = [ ]
        for x in d :
            [ x ] = INF
        for i in range ( m ) :
            a , b , c = _warshall_floyd ( n , n , n , r )
            d.append ( [ a , b , c ] )
        d = warshall_floyd ( n , d )
        dfs ( 1 , - 1 , 0 , d )
        print ( res )
    def dfs ( c , las , dist , d ) :
        if c == r_len + 1 :
            if res > dist :
                res = dist
                return
        for i in range ( 1 , r_len + 1 ) :
            if not used [ i ] :
                used [ i ] = True
                if las == - 1 :
                    dfs ( c + 1 , i , 0 , d )
                else :
                    dfs ( c + 1 , i , dist + d [ r [ las ] ] [ r [ i ] ] , d )
                used [ i ] = False
    def warshall_floyd ( n , d ) :
        for k in range ( 1 , n + 1 ) :
            for i in range ( 1 , n + 1 ) :
                for j in range ( 1 , n + 1 ) :
                    if d [ i ] [ j ] > d [ i ] [ k ] + d [ k ] [ j ] :
                        d [ i ] [ j ] = d [ i ] [ k ] + d [ k ] [ j ]
        return d
return Main
