def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        r = sc.__next__ ( )
        if r < 1200 :
            print ( "ABC" )
        elif r < 2800 :
            print ( "ARC" )
        else :
            print ( "AGC" )
