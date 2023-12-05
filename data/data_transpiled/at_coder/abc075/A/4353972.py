def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
        def execute ( self ) :
            if self.A == self.B :
                print ( self.C )
            elif self.A == self.C :
                print ( self.B )
            else :
                print ( self.A )
