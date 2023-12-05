def import import _raw_input
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _raw_input ( )
    def main ( self ) :
        m , d = self.sc.split ( )
        print ( "YES" if m % d == 0 else "NO" )
