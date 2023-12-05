def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            N = self.scn.read ( )
            print ( "ABC" if N < 1000 else "ABD" )
