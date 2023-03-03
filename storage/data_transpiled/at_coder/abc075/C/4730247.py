def _import ( ) :
    from itertools import count , repeat
    from itertools import chain , repeat
    from itertools import chain , repeat
    n , m = repeat ( 'n' ) , repeat ( 'm' )
    a , b = [ repeat ( 'a' , n ) for n in range ( m ) ]
    graph = { }
    visited = [ False for i in range ( n ) ]
    for i in range ( m ) :
        graph [ a [ i ] - 1 ] [ b [ i ] - 1 ] = graph [ b [ i ] ] [ a [ i ] ] = True
        ans = 0
        for i in range ( m ) :
            graph [ a [ i ] ] [ b [ i ] ] = graph [ b [ i ] ] [ a [ i ] ] = False
            [ visited ] = False
            dfs ( 0 )
            if count ( 1 ) :
                ans += 1
            graph [ a [ i ] ] [ b [ i ] ] = graph [ b [ i ] ] [ a [ i ] ] = True
        print ( ans )
    def dfs ( v ) :
        visited [ v ] = True
        for v2 in range ( n ) :
            if graph [ v ] [ v2 ] and not visited [ v2 ] :
                dfs ( v2 )
    return reduce ( dfs , [ a , b ] )
