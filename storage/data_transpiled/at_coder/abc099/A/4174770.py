def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            print ( 'ABC' if self.sc.read ( 1 ) < 1000 else 'ABD' )
