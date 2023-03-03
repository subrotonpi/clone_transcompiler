def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
            self.D = sys.stdin.read ( )
            if self.A + self.B > self.C + self.D :
                print ( "Left" )
            elif self.A + self.B < self.C + self.D :
                print ( "Right" )
            else :
                print ( "Balanced" )
