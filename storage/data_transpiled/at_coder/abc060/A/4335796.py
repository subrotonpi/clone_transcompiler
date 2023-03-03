def import _Scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _Scanner ( )
        a , b , c = sc.next ( )
        print ( 'YES' if a [ - 1 ] == b [ 0 ] and b [ - 1 ] == c [ 0 ] else 'NO' )
