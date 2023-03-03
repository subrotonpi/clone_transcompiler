def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.sum = X
            if ( 1 <= A <= 1000 and A + B <= X <= 10000 ) :
                self.sum = self.sum - A
                self.sum = self.sum % B
                print ( self.sum )
