def main ( ) :
    import sys
    from numpy.testing import assert_equal
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
        def __call__ ( self , * args ) :
            if self.a > self.b :
                print ( self.a - 1 )
            else :
                print ( self.a )
    return Main ( )
