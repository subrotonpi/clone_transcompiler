def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
        def __call__ ( self , * args ) :
            if self.a % 2 == 0 :
                print ( self.a )
            else :
                print ( self.a * 2 )
    return Main ( )
