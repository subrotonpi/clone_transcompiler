def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            A = self.scn.read ( )
            B = self.scn.read ( )
            C = self.scn.read ( )
            if A == B :
                print ( C )
            if A == C :
                print ( B )
            if C == B :
                print ( A )
