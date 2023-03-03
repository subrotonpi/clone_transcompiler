def import _raw_input
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _raw_input ( )
    def main ( self ) :
        a , b , c = _raw_input ( )
        print ( 'YES' if b - a == c - b else 'NO' )
