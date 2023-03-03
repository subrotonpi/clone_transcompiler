def _ ( a , b ) :
    from math import pow , mod , exp
    MOD = 1000000007
    def main ( ) :
        sc = sys.stdin
        N = sc.randint ( 0 , N )
        MAX = 2000
        A = [ sc.randint ( 0 , N ) for i in range ( N ) ]
        B = [ sc.randint ( 0 , N ) for i in range ( N ) ]
        dp = [ [ MAX - A [ i ] , MAX - B [ i ] ] for i in range ( N ) ]
        for i in range ( MAX * 2 + 1 ) :
            dp [ MAX - A [ i ] , MAX - B [ i ] ] += 1
        for i in range ( 0 , MAX * 2 ) :
            for j in range ( 0 , MAX * 2 ) :
                if i < MAX * 2 :
                    dp [ i + 1 , j ] = int ( ( dp [ i + 1 , j ] + dp [ i , j ] ) % MOD )
                if j < MAX * 2 :
                    dp [ i , j + 1 ] = int ( ( dp [ i , j + 1 ] + dp [ i , j ] ) % MOD )
        sum = 0
        for i in range ( N ) :
            sum = ( sum + dp [ MAX + A [ i ] , MAX + B [ i ] ] ) % MOD
        init ( MAX * 4 )
        for i in range ( N ) :
            sum = ( sum - comb ( A [ i ] * 2 + B [ i ] * 2 , A [ i ] * 2 ) + MOD ) % MOD
            print ( sum * rev [ 2 ] % MOD )
        sc.close ( )
    fac , rev , revfac = [ 1 ] , [ 0 ] , [ 0 ] , [ ]
    for i in range ( 1 , N + 1 ) :
        fac.append ( fac [ i - 1 ] * i % MOD )
        rev.append ( rev [ i ] )
        revfac.append ( rev [ i ] )
    return fac , rev , revfac
