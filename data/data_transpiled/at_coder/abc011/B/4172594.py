def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.str = sys.stdin.read ( )
            self.print ( self.str [ 0 ].upper ( ) + self.str [ 1 : ].lower ( ) )
