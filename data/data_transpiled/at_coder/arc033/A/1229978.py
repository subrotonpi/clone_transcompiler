def import import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        s = _scanner.Scanner ( )
        self.n = s.next ( )
        print ( self.n * ( self.n + 1 ) / 2 )
