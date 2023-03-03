def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a , b , c = sc.__next__ ( )
        print ( a * b * 2 + a * c * 2 + b * c * 2 )
