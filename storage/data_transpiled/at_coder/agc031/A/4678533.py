def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1_000_000_007
    def __call__ ( self ) :
        sc = _sys.stdin
        n = sc.readline ( )
        sc.readline ( )
        str = sc.readline ( ).decode ( 'utf-8' )
        counts = [ 0 ] * 26
        for c in str :
            counts [ c - 'a' ] += 1
        ans = counts [ 0 ] + 1
        for c in counts [ 1 : ] :
            ans = ( ans * ( c + 1 ) ) % self.MOD
        print ( ans - 1 )
