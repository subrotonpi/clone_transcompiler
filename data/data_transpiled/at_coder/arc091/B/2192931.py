def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = self.N
            self.K = self.K
    ans = 0
    for alpha in range ( 1 , K + 1 ) :
        b = K + alpha
        n = ( N - K ) // b
        ans += n * alpha
        if K + n * b <= N :
            ans += min ( N , K + n * b + alpha - 1 ) - ( K + n * b ) + 1
    if K == 0 :
        ans -= N
    print ( ans )
