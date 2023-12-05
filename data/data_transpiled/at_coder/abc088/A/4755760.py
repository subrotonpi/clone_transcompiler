def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        a = sc.__next__ ( )
        if n % 500 <= a :
            print ( "Yes" )
        else :
            print ( "No" )
