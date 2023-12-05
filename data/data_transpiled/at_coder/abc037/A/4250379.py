def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a , b , c = sc.__next__ ( )
        if a > b :
            print ( c / b )
        else :
            print ( c / a )
