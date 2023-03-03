def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 0
        def __call__ ( self , * args ) :
            self.n = int ( args )
            if self.n % 2 == 0 :
                print ( self.n )
            else :
                print ( self.n * 2 )
    return Main ( )
