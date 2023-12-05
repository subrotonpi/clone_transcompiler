def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = None
            self.a = None
            self.b = None
        def input ( self ) :
            with open ( self.input , 'r' ) as f :
                self.N = f.read ( )
                self.a = f.read ( )
                self.b = f.read ( )
        def main ( self ) :
            self.input ( )
            if self.N >= 5 :
                print ( ( self.N - 5 ) * self.a + 5 * self.b )
            else :
                print ( self.N * self.b )
