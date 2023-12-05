def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = 1
            self.B = 2
        def __call__ ( self , * args ) :
            if self.A % 2 == 1 and self.B % 2 == 1 :
                print ( "Yes" )
            else :
                print ( "No" )
    return Main
