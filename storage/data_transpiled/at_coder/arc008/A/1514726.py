def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
        def __call__ ( self ) :
            return self.n / 10 * 100 + ( 100 if self.n % 10 > 6 else self.n % 10 * 15 )
