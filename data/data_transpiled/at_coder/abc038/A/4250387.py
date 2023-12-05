def import _raw_input
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _raw_input ( )
    def main ( self ) :
        s = self.sc.__next__ ( )
        if s [ - 1 ] == 'T' :
            self.raw_input ( "YES" )
        else :
            self.raw_input ( "NO" )
