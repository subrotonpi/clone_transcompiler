def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
        def __call__ ( self , * args ) :
            if self.a <= 1199 :
                print ( "ABC" )
            else :
                print ( "ARC" )
    return Main
