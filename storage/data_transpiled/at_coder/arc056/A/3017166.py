def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.K = sys.stdin.read ( )
            self.L = sys.stdin.read ( )
            if self.B == A * self.L :
                print ( A * K )
            else :
                print ( min ( ( B * ( ( self.K + self.L - 1 ) / self.L ) , B * ( self.K / self.L ) + A * ( ( self.K - ( self.K / self.L ) ** 2 ) ) ) ) )
