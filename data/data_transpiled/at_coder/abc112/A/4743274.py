def main ( ) :
    import sys
    from numpy.testing import assert_equal
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( sys.argv )
            if self.N == 1 :
                print ( "Hello World" )
            elif self.N == 2 :
                a = self.N
                b = self.N
                print ( a + b )
