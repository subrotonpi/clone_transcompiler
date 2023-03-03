def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
            self.K = sys.stdin.read ( )
            self.S = sys.stdin.read ( )
            self.T = sys.stdin.read ( )
    ans = 0
    ans += A * S
    ans += B * T
    if S + T >= K :
        ans -= C * ( S + T )
    print ( ans )
