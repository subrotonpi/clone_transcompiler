def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a , b = sc.__next__ ( ) , sc.__next__ ( )
        if a > b :
            print ( "Worse" )
        else :
            print ( "Better" )
