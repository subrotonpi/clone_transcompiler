def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
        def execute ( self ) :
            if self.A > self.B and self.A > self.C :
                self.execute ( 1 )
                if self.B > self.C :
                    self.execute ( 2 )
                    self.execute ( 3 )
                else :
                    self.execute ( 3 )
                    self.execute ( 2 )
            elif self.B > self.A and self.B > self.C :
                if self.A > self.C :
                    self.execute ( 2 )
                    self.execute ( 1 )
                    self.execute ( 3 )
                elif self.A < self.C :
                    self.execute ( 3 )
                    self.execute ( 1 )
                    self.execute ( 2 )
            elif self.C > self.A and self.B > self.C :
                if self.A > self.B :
                    self.execute ( 2 )
                    self.execute ( 3 )
                    self.execute ( 1 )
                elif self.A < self.B :
                    self.execute ( 3 )
                    self.execute ( 2 )
                    self.execute ( 1 )
