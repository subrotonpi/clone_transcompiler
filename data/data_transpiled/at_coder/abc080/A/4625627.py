def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            self.N , A , B = self.scn.shape
            print ( min ( N * A , B ) )
