def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _scanner ( )
    def main ( self ) :
        print ( ( self.sc + self.sc ) % 24 )
