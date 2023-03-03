def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.b = sys.stdin.read ( )
            self.hour = self.a + self.b
            if self.hour < 24 :
                self.print ( self.hour )
            else :
                self.print ( self.hour % 24 )
