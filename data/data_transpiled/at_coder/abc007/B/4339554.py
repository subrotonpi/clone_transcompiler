def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _scanner
    def main ( self ) :
        s = self.sc.next ( )
        print ( - 1 if s == 'a' else 'a' )
