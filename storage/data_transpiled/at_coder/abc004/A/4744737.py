def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.i = self.sc.__next__ ( )
            print ( 2 * self.i )
    return Main ( )
