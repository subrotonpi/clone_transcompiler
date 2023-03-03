def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _scanner ( )
    def main ( self ) :
        print ( int ( self.s.replace ( 'O' , '0' ).replace ( 'D' , '0' ).replace ( 'I' , '1' ).replace ( 'Z' , '2' ).replace ( 'S' , '5' ).replace ( 'B' , '8' ) ) )
