def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.q = sys.stdin.read ( )
            self.stdout.close ( )
            print ( 'ABC' if self.q == 1 else 'chokudai' )
