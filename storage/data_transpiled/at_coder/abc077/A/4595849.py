def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self , * args ) :
            c1 = args [ 0 ]
            c2 = args [ 1 ]
            if c1 [ 0 ] == c2 [ 2 ] and c1 [ 1 ] == c2 [ 1 ] and c1 [ 2 ] == c2 [ 0 ] :
                print ( "YES" )
            else :
                print ( "NO" )
    return Main ( )
