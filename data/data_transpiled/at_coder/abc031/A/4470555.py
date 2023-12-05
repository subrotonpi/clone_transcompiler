def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.d = sys.stdin.read ( )
            if self.a > self.d :
                print ( ( self.d + 1 ) * self.a )
            else :
                print ( ( self.a + 1 ) * self.d )
