def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
        def call ( self ) :
            print ( ( 'error' if self.a + self.b >= 10 else '' ) )
    return Main ( )
