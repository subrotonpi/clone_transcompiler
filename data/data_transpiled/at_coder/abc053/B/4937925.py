def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        print ( s.rfind ( "Z" ) - s.find ( "A" ) + 1 )
