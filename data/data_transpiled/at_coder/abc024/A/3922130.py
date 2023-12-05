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
            if self.S + self.T >= K :
                print ( A * self.S + B * self.T - C * ( self.S + self.T ) )
            else :
                print ( A * self.S + B * self.T )
