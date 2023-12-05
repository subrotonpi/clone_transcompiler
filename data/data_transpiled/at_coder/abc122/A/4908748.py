def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
            if self.s == 'A' :
                self.T = 'A'
            elif self.s == 'T' :
                self.A = 'A'
            elif self.s == 'C' :
                self.G = 'G'
            elif self.s == 'G' :
                self.C = 'C'
    return Main ( )
