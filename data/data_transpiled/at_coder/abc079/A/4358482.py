def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
        def __call__ ( self , * args ) :
            if self.X [ 0 ] == self.X [ 1 ] and self.X [ 1 ] == self.X [ 2 ] :
                print ( "Yes" )
            elif self.X [ 1 ] == self.X [ 2 ] and self.X [ 2 ] == self.X [ 3 ] :
                print ( "Yes" )
            else :
                print ( "No" )
