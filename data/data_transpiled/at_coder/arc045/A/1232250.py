def import _Scanner
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
    def main ( self ) :
        print ( self.s.decode ( 'Left' ).replace ( '<' , '' ).replace ( '>' , '' ).replace ( 'AtCoder' , 'A' ) )
