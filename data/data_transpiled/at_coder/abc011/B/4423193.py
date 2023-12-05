def import _main
class Main ( object ) :
    def __init__ ( self , args ) :
        sc = _main ( args )
        s = sc.next ( )
        print ( s [ 0 ].upper ( ) + s [ 1 : ].lower ( ) )
