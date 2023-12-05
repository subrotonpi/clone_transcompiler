def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.L = int ( sys.stdin.read ( ) )
            self.X = int ( sys.stdin.read ( ) )
            self.Y = int ( sys.stdin.read ( ) )
            self.S = int ( sys.stdin.read ( ) )
            self.D = int ( sys.stdin.read ( ) )
            self.tokei = 0
            self.hantokei = 0
            if self.D > self.S :
                self.tokei = self.D - self.S
                self.hantokei = self.L - self.D + self.S
            elif self.S > self.D :
                self.tokei = self.L - self.S + self.D
                self.hantokei = self.S - self.D
            if self.X >= self.Y :
                print ( float ( self.tokei ) / ( self.X + self.Y ) )
            else :
                print ( min ( float ( self.tokei ) / ( self.X + self.Y ) , float ( self.hantokei ) / ( self.Y - self.X ) ) )
