def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            N = self.scn.read ( )
            print ( "Yes" if N % 10 == 9 or N / 10 == 9 else "No" )
    return Main ( )
