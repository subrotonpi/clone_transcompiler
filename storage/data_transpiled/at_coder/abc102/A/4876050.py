def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.n = int ( self.sc )
            self.print ( n if self.n % 2 == 0 else 2 * self.n )
