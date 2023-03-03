def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.fibonacci = [ 1 ] * 42
            self.fibonacci [ 1 ] = 1
            self.fibonacci [ 2 ] = 1
            for i in range ( 3 , 41 ) :
                self.fibonacci [ i ] = self.fibonacci [ i - 1 ] + self.fibonacci [ i - 2 ]
            a = self.fibonacci [ 0 ]
            print ( self.fibonacci [ a ] , self.fibonacci [ a + 1 ] )
