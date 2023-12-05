def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( sys.stdin.read ( ) )
            self.K = len ( sys.stdin.read ( ) )
            self.map = [ [ 0 ] * 4 * self.K + [ 1 ] * 4 * self.K + [ 0 ] * 4 * self.K + [ 1 ] * 4 * self.K + [ 0 ] * 4 * self.K + [ 0 ] * 4 * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K - 1 + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K - 1 + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K - 1 + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K - 1 + [ 0 ] * self.K + [ 0 ] * self.K - 1 + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K - 1 + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K - 1 + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K - 1 + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K + [ 0 ] * self.K
