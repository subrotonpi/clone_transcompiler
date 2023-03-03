def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            self.A = sys.stdin.read ( ) * - 1
            self.B = sys.stdin.read ( )
            if self.A + self.B > self.X :
                print ( 'dangerous' )
            elif self.A + self.B > 0 :
                print ( 'safe' )
            else :
                print ( 'delicious' )
