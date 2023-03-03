def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.argv [ 1 ]
            if self.a > sys.argv [ 2 ] :
                del self.a
            print ( self.a )
