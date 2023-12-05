def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self ) :
            if 1 == self.sc :
                print ( "ABC" )
            else :
                print ( "chokudai" )
    return Main
