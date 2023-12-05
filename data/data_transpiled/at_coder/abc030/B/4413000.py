def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        po = abs ( float ( self.sc.value ) % 12 ) * 30 - float ( self.sc.value ) * ( 11.0 / 2 )
        print ( min ( po , 360.0 - po ) )
