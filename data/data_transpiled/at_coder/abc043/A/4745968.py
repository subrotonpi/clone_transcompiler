def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.input = sys.stdin
            self.a = sys.stdin.read ( )
            print ( ( self.a * ( self.a + 1 ) ) / 2 )
