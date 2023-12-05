def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.v = 1
        def __call__ ( self , * args ) :
            return self.v - 1
    return Main ( )
