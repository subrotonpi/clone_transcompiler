def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
        def __call__ ( self ) :
            return self.n
    n = Main ( )
    print ( "Yes" if ( n / 10 == 9 or n % 10 == 9 ) else "No" )
