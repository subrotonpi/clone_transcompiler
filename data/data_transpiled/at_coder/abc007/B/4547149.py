def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
            self.c = sys.stdin.read ( )
        def call ( self ) :
            if len ( self.s ) < 2 and self.c [ 0 ] == 'a' :
                self.exit ( - 1 )
            else :
                self.exit ( 'a' )
