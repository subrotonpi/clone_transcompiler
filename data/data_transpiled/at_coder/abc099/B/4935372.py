def import _recrec
class Main ( object ) :
    def __init__ ( self ) :
        self.a = _recrec ( )
        self.b = _recrec ( )
        self.c = self.rec ( )
    def rec ( self , i ) :
        return ( self.a , self.b )
