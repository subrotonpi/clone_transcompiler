def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.MOD = 1_000_000_007
    def main ( self ) :
        N = sc.__next__ ( )
        A = sc.__next__ ( )
        B = sc.__next__ ( )
        if A > B :
            t = A
            A , B = B , t
        S = [ - 1_000_000_000_000_001 ]
        for i in range ( N ) :
            S.append ( int ( sc.__next__ ( ) ) )
            if i > 0 and S [ i + 1 ] < S [ i - 1 ] + A :
                print ( 0 )
                return
        dp = [ [ 1 , 0 ] ] * 2
        bsum = [ 1 ] * 2
        limit = 0
        prev = 0
        for i in range ( 2 , N + 1 ) :
            while S [ prev + 1 ] <= S [ i ] - B :
                prev += 1
            if S [ i ] < S [ i - 1 ] + A :
                dp [ 0 ].append ( dp [ 1 ] [ i - 1 ] )
                dp [ 1 ].append ( prev if prev < limit else ( bsum [ prev + 1 ] - bsum [ limit ] + MOD ) % MOD )
                limit = i - 1
            else :
                dp [ 0 ].append ( ( dp [ 0 ] [ i - 1 ] + dp [ 1 ] [ i - 1 ] ) % MOD )
                dp [ 1 ].append ( prev if prev < limit else ( bsum [ prev + 1 ] - bsum [ limit ] + MOD ) % MOD )
            bsum [ i + 1 ] = ( bsum [ i ] + dp [ 1 ] [ i ] ) % MOD
        ans = ( dp [ 0 ] [ N ] + dp [ 1 ] [ N ] ) % MOD
        print ( ans )
