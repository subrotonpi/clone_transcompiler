def import _main
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = _main ( args )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        print ( a if len ( a ) > len ( b ) else b )
