def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.S = sys.stdin.read ( )
        self.T = sys.stdin.read ( )
        for s in range ( len ( S ) ) :
            if T [ 0 ] == S [ s ] and T.startswith ( S [ s : ] ) :
                self.print ( self.N * 2 - ( len ( S ) - s ) )
                return
        self.print ( self.N * 2 )
