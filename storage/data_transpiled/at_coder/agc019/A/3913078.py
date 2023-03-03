def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.Q = int ( sys.stdin.read ( ) )
            self.H = int ( sys.stdin.read ( ) )
            self.S = int ( sys.stdin.read ( ) )
            self.D = int ( sys.stdin.read ( ) )
            self.N = int ( sys.stdin.read ( ) )
    min1l = min ( min ( 4 * Q , 2 * H ) , S )
    min2l = min ( min ( 8 * Q , 4 * H ) , min ( 2 * S , D ) )
    ans = 0
    if N % 2 == 1 :
        ans = ( N - 1 ) / 2 * min2l + min1l
    else :
        ans = N / 2 * min2l
    print ( ans )
