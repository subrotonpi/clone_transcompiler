def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            print ( ( self.X - self.A ) % self.B )
    return Main ( )
