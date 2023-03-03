def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.S = 'a'
        def __call__ ( self , * args ) :
            if self.S == 'a' :
                print ( '-1' )
            else :
                print ( 'a' )
    return Main ( )
