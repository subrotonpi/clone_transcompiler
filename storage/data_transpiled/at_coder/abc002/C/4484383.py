def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.xa = float ( 'inf' )
        self.ya = float ( '-inf' )
        self.xb = float ( '-inf' )
        self.yb = float ( '-inf' )
        self.xc = float ( '-inf' )
        self.yc = float ( '-inf' )
        self.print ( abs ( ( xb - xa ) * ( yc - ya ) - ( xc - xa ) * ( yb - ya ) ) / 2 )
