def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.b = sys.stdin.read ( )
            self.result = self.a + self.b
            if self.result >= 24 :
                self.result -= 24
            print ( self.result )
