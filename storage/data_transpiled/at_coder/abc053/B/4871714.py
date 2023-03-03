def import _main
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = _main ( args )
        s = sc.next ( )
        print ( ( s.rfind ( "Z" ) - s.find ( "A" ) ) + 1 )
