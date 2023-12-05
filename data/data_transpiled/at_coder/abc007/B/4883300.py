def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
        def call ( self ) :
            if self.s == 'a' :
                self.exit ( - 1 )
            else :
                self.exit ( 'a' )
    return Main ( )
