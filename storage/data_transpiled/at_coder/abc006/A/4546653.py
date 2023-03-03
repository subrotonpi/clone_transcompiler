def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x = 1
        def __call__ ( self , * args ) :
            if self.x % 3 == 0 :
                print ( "YES" )
            else :
                print ( "NO" )
    return Main ( )
