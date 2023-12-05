def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        a = sc.scanner.scanner
        b = sc.scanner.scanner
        if a < 0 : a += 1
        if b < 0 : b += 1
        print ( b - a )
