def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            self.ngs = len ( self.X )
        def __call__ ( self , * args ) :
            if self.X [ 0 ] == 'o' or self.X [ 0 ] == 'k' or self.X [ 0 ] == 'u' :
                pass
            elif self.X [ 0 ] == 'c' :
                if self.X [ 0 ] == 'h' :
                    cnt += 1
                else :
                    self.print ( 'NO' )
                    sys.exit ( )
            else :
                self.print ( 'NO' )
                sys.exit ( )
    Main ( )
