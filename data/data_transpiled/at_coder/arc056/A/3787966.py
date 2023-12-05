def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.K = sys.stdin.read ( )
            self.L = sys.stdin.read ( )
    ans = 0
    if K % L == 0 :
        ans = ( K // L ) * B
    elif K % L != 0 :
        ans = min ( ( L + K - 1 ) // L * B , ( K // L ) * B + ( K - ( K // L ) * L ) * A )
    print ( ans )
