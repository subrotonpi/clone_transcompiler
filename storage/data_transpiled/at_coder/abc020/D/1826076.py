def main ( * args ) :
    from math import pow , mul
    def run ( ) :
        sc = yield from args
        n = sc.n
        k = sc.k
        print ( solve ( n , k ) )
    MOD = 1_000_000_000 + 7
    def solve ( n , k ) :
        if k == 1 :
            return n % MOD * ( n + 1 ) % MOD * inv ( 2 ) % MOD
        return lcm ( a , n )
    def solve ( n , k ) :
        if k == 1 :
            return n % MOD * ( n + 1 ) % MOD * inv ( 2 ) % MOD
        return lcm ( a , n )
    def solve ( n , k ) :
        if k == 1 :
            return n % MOD * ( n + 1 ) % MOD * inv ( 2 ) % MOD
        return lcm ( a , n )
    def dfs ( n , k , n ) :
        if n % MOD == 1 :
            return n % MOD * ( n + 1 ) % MOD * inv ( 2 ) % MOD
        return lcm ( n , n )
    p = [ [ 0 ] * 9 ]
    q = 0
    def dfs ( n , k , n ) :
        k_ = k
        for i in range ( 2 , n + 1 ) :
            c = 0
            while k_ % i == 0 :
                k_ /= i
                c += 1
            if c > 0 :
                p [ 0 ].append ( q )
                p [ 1 ].append ( c )
                q += 1
        if k_ > 1 :
            p [ 0 ].append ( k_ )
            p [ 1 ].append ( 1 )
            q += 1
        p [ 0 ] = [ p [ 0 ] ]
        p [ 1 ] = [ p [ 1 ] ]
        tmp = [ p [ 0 ] ]
        return ( dfs ( 0 , p , k , n ) )
    tmp = [ 0 ] * 9
    dfs ( idx , p , k , n )
    ret = 0
    for i in range ( 0 , len ( p ) ) :
        if ( s >> 1 ) == 1 :
            if p [ 1 ] [ i ] - tmp [ i ] == 0 :
            INDENT