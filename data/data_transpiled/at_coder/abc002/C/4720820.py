def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sn = raw_input ( )
        xa , ya , xb , yb , xc , yc = self.sn.split ( ' ' )
        print ( abs ( ( ( xb - xa ) * ( yc - yb ) - ( xb - xc ) * ( ya - yb ) ) / 2.0 ) )
