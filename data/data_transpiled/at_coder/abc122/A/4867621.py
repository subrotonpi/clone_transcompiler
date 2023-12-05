def import _pair
class Main ( object ) :
    def __init__ ( self ) :
        with self.open ( 'file' ) as sc :
            b = sc.read ( )
            print ( self.pair ( b ) )
    def pair ( b ) :
        A , C , G , T = _pair ( b )
        if b == A :
            return T
        elif b == T :
            return A
        elif b == G :
            return C
        elif b == C :
            return G
        else :
            return ''
