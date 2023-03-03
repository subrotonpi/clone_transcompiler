def tr ( * args ) : return [ x + y for x , y in zip ( args [ 1 : ] , args [ 2 : ] ) ]
MOD = 1_000_000_000 + 7
def comb ( * args ) : return [ [ x + y for x , y in zip ( args [ 1 : ] , args [ 3 : ] ) ] for x in range ( 1 , 1000 ) ]
def main ( ) :
    def tr ( * args ) : return [ ]
    def solve ( r , c , x , y , d , l ) :
        print ( sum ( map ( lambda x : x + y , args ) ) )
    return solve ( r , c , x , y , d , l )
def tr ( * args ) :
    ans = 0
    for s in range ( 1 << 4 ) :
        area = x * y
        for u in range ( x ) :
            for v in range ( y ) :
                flag = False
                if s & 1 :
                    flag |= u == 0
                if ( ( s >> 1 ) & 1 ) :
                    flag |= u == x - 1
                if ( ( s >> 2 ) & 1 ) :
                    flag |= v == 0
                if ( ( s >> 3 ) & 1 ) :
                    flag |= v == y - 1
                if flag :
                    area -= 1
        if not ( area >= d + l ) :
            continue
        tmp = comb [ area ] [ d + l ] % MOD * comb [ d + l ] [ l ] % MOD
        ans = ans + long ( MOD + pow ( - 1 , int ( s ) ) ) * tmp
        ans %= MOD
    ans %= MOD
    return ans
