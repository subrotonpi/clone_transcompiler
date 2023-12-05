def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self , * args ) :
            x = args [ 0 ] / 100.0
            y = args [ 1 ]
            ans = y * sum ( x ** 2 )
            sys.stdout.write ( "%.5f\n" % ans )
    return Main
