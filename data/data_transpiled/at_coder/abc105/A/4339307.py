def import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        n , k = sc.__next__ ( )
        print ( 0 if n % k == 0 else 1 )
