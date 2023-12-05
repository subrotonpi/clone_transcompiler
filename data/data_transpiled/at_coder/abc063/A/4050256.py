def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
            if self.a + self.b >= 10 :
                print ( "error" )
                return
            print ( self.a + self.b )
    return Main ( )
