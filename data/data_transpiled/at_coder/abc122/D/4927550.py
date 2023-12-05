def Main ( ) :
    memo = [ ]
    def dfs ( r , l1 , l2 , l3 ) :
        print ( memo [ r ] [ l1 ] [ l2 ] [ l3 ] )
        return memo [ r ] [ l1 ] [ l2 ] [ l3 ] if r in memo else ( memo [ r ] [ l1 ] [ l2 ] [ l3 ] + ( ( r == 1 and 2 or dfs ( r - 1 , l2 , l3 , 'A' ) + dfs ( r - 1 , l2 , l3 , 'T' ) ) + ( l2 != 'G' and l3 != 'G' or l1 != 'A' and l2 != 'A' and l3 != 'A' ) ) % 1000000007 )
    return dfs
