def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            self.N = self.scn.read ( )
            self.A = self.scn.read ( )
            self.print ( self.N * self.N - self.A )
