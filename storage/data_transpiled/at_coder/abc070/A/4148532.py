def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
        def __call__ ( self ) :
            self.n = int ( self.n )
            print ( "Yes" if ( self.n / 100 == self.n % 10 ) else "No" )
    return Main
