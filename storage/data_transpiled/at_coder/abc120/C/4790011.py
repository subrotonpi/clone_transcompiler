def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.S = _main ( )
    def __str__ ( self ) :
        return ""
    def __init__ ( self ) :
        self.S = _main ( )
    def __init__ ( self ) :
        self.S1 = _main ( )
        self.S1 = self.S.replace ( '0' , '' )
        n1 = len ( self.S1 )
        n0 = len ( self.S ) - n1
        min = min ( n1 , n0 )
        print ( 2 * min )
