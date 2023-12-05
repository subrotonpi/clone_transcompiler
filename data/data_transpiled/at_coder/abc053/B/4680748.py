def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        str = sc.__next__ ( )
        print ( str.rfind ( "Z" ) - str.find ( "A" ) + 1 )
