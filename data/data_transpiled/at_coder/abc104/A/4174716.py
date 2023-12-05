def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            r = self.sc.read ( )
            print ( 'ABC' if r < 1200 else 'ARC' if r < 2800 else 'AGC' )
    return Main
