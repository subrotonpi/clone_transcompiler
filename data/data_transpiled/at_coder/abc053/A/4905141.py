def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x = sys.stdin.read ( )
            if self.x < 1200 :
                print ( "ABC" )
            else :
                print ( "ARC" )
    return Main ( )
