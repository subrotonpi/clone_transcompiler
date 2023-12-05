def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.str = sys.stdin.read ( )
            self.print ( self.str [ 0 ] == self.str [ - 1 ] ^ len ( self.str ) % 2 == 1 )
