def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        s = s [ 0 ].upper ( ) + s [ 1 : ].lower ( )
        print ( s )
