def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        x = self.s.readline ( ) [ 0 ]
        print ( x == 'T' and 'A' or 'G' )
