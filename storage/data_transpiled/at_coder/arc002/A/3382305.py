def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.Y = sys.maxint
        def __call__ ( self ) :
            if self.Y % 400 == 0 :
                print ( "YES" )
            elif self.Y % 100 == 0 :
                print ( "NO" )
            elif self.Y % 4 == 0 :
                print ( "YES" )
            else :
                print ( "NO" )
    return Main
