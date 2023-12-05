def main ( args ) :
    import sys
    def solve ( s ) :
        N = len ( s )
        state = 0
        for i in range ( N ) :
            if s [ i ] == '.' :
                state |= 1 << i
        max = 1 << N
        dp = [ 0 ] * max
        for i in range ( 1 , max ) :
            add = 0
            for j in range ( N ) :
                k = 0
                while ( i & ( 1 << ( ( j + k ) % N ) ) ) == 0 :
                    k += 1
                add += N - k
                add += dp [ i ^ ( 1 << ( ( j + k ) % N ) ) ]
            dp [ i ] = add / N
        return dp [ state ]
    def solve ( ) :
        with open ( 'input.txt' , 'r' ) as cin :
            T = cin.read ( )
            for C in range ( 1 , T + 1 ) :
                s = cin.read ( )
                print ( 'Case #%d: %s' % ( C , solve ( s ) ) )
    return solve
