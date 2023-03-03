def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.w = sys.stdin.read ( )
            self.a = sys.stdin.read ( )
            self.b = sys.stdin.read ( )
            print ( self.a + self.w < self.b )
    return Main ( )
