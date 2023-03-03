def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            n = self.sc.readline ( ).strip ( )
            if n == 1 :
                print ( "ABC" )
            else :
                print ( "chokudai" )
    return Main ( )
