def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x = sys.stdin.read ( )
            self.y = sys.stdin.read ( )
            if self.y - self.x > 0 :
                print ( "Better" )
                return
            print ( "Worse" )
    return Main ( )
