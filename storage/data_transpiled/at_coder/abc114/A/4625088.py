def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            X = self.scn.read ( )
            print ( "YES" if ( X == 7 or X == 5 or X == 3 ) else "NO" )
    return Main ( )
