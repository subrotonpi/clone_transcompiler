def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
        def __call__ ( self , * args ) :
            if self.a == 1 :
                print ( "ABC" )
            else :
                print ( "chokudai" )
    return Main
