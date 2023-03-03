def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        str = sc.read ( )
        str = str [ 0 ].upper ( ) + str [ 1 : ].lower ( )
        print ( str )
