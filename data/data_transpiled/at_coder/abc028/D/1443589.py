def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve ( )
        def solve ( self ) :
            sc = sys.stdin
            N = sc.read ( )
            K = sc.read ( )
            ans = 0
            if K > 1 and K < N :
                ans = ( ( K - 1 ) * ( N - K ) * 6 + ( N - 1 ) * 3 + 1 ) / ( N ** 2 )
            else :
                ans = ( ( N - 1 ) ** 3 + 1 ) / ( N ** 2 )
            print ( ans )
    return Main ( )
