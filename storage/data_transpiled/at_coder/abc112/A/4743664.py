def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = 0
        def __call__ ( self , * args ) :
            if self.N == 1 :
                print ( "Hello World" )
            elif self.N == 2 :
                A = self.A
                B = self.B
                print ( A + B )
    return Main ( )
