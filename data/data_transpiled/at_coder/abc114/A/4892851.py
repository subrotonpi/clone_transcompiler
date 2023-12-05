def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            if self.X in [ 7 , 5 , 3 ] :
                print ( "YES" )
            else :
                print ( "NO" )
    return Main ( )
