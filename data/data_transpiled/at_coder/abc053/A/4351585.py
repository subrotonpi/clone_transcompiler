def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        a = self.sc.randint ( 0 , 1200 )
        print ( ( 'ARC' if a >= 1200 else 'ABC' ) )
