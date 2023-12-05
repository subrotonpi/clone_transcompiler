def import _Scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _Scanner ( )
        s = sc.next ( )
        s = [ s [ i : i + 2 ] for i in range ( 0 , len ( s ) , 2 ) ]
        print ( s )
