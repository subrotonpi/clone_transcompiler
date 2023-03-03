def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            self.R = self.scn.read ( )
            self.G = self.scn.read ( )
            self.print ( self.G * 2 - self.R )
