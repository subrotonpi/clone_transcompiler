def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
        def execute ( self ) :
            if self.A < self.B < self.C :
                print ( 3 )
                print ( 2 )
                print ( 1 )
            elif self.A < self.C < self.B :
                print ( 3 )
                print ( 1 )
                print ( 2 )
            elif self.B < self.C and self.C < self.A :
                print ( 1 )
                print ( 3 )
                print ( 2 )
            elif self.B < self.A :
                print ( 2 )
                print ( 3 )
                print ( 1 )
                print ( 2 )
            elif self.C < self.A :
                print ( 1 )
                print ( 3 )
                print ( 2 )
            elif self.C < self.A :
                print ( 2 )
                print ( 3 )
                print ( 1 )
            elif self.C < self.A :
                print ( 2 )
                print ( 3 )
                print ( 1 )
            elif self.C < self.B :
                print ( 1 )
                print ( 2 )
                print ( 3 )
