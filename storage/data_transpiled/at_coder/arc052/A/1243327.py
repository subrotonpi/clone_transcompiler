def import _scanner
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s.read ( ).decode ( 'utf-8' )
    def main ( self ) :
        print ( self.s.decode ( 'utf-8' ) )
