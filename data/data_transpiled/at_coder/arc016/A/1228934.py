def import import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        s = _scanner.scanner ( )
        n , m = s.next ( )
        print ( m % n + 1 )
