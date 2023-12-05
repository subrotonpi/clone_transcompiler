def import _raw_input
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _raw_input ( )
    def main ( self ) :
        print ( 'YES' if ( self.sc.value * 100 + self.sc.value * 10 + self.sc.value ) % 4 == 0 else 'NO' )
