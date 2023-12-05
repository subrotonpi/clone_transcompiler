def import _main
class Main ( object ) :
    def __init__ ( self ) :
        s = _main ( )
        x , y , k = s.split ( )
        print ( x + y - abs ( y - k ) )
