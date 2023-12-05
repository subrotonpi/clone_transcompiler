def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.Q = int ( self.Q )
            self.H = int ( self.H )
            self.S = int ( self.S )
            self.D = int ( self.D )
            self.n = int ( self.n )
            self.N = 4 * self.n
    ans = 0
    if D <= 2 * S and D <= 4 * H and D <= 8 * Q and 8 <= N :
        ans += D * ( N / 8 )
        N = N % 8
    if S <= 2 * H and S <= 4 * Q and 4 <= N :
        ans += S * ( N / 4 )
        N = N % 4
    if H <= 2 * Q and 2 <= N :
        ans += H * ( N / 2 )
        N = N % 2
    ans += N * Q
    print ( ans )
