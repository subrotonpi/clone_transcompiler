def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
        def __call__ ( self , * args ) :
            if self.a % 2 == 1 :
                print ( self.a + 1 )
            else :
                print ( self.a - 1 )
    return Main ( )
