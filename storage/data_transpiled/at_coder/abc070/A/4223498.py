def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
        def __call__ ( self , * args ) :
            print ( "Yes" if self.a % 10 == self.a / 100 else "No" )
    return Main ( )
