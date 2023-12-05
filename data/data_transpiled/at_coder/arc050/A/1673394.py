def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.C = sys.stdin.read ( )
            self.c = sys.stdin.read ( )
            if self.C.lower ( ) == self.c :
                print ( "Yes" )
            else :
                print ( "No" )
    return Main ( )
