def import _Scanner
class Main ( object ) :
    def __init__ ( self ) :
        s = _Scanner ( )
        print ( pow ( s.value / 100 , 2 ) * s.value )
