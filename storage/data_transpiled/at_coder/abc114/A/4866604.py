def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x = 1
        def __call__ ( self , * args ) :
            if self.x in ( 3 , 5 , 7 ) :
                print ( "YES" )
            else :
                print ( "NO" )
    return Main ( )
