def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
        def execute ( self ) :
            if self.A + self.B == self.C and self.A - self.B == self.C :
                print ( "?" )
            elif self.A + self.B == self.C and self.A - self.B != self.C :
                print ( "+" )
            elif self.A - self.B == self.C and self.A + self.B != self.C :
                print ( "-" )
            else :
                print ( "!" )
