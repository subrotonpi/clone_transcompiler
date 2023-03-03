def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
            self.a = 3
            self.b = 3
        def __repr__ ( self ) :
            return "Possible" if self.a * self.b * ( self.a + self.b ) % 3 == 0 else "Impossible"
    return Main ( )
