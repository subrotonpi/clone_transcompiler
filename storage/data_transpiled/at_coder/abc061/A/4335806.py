def import _raw_input
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _raw_input ( )
    def main ( self ) :
        a , b , c = _raw_input ( )
        print ( "Yes" if c >= a and c <= b else "No" )
