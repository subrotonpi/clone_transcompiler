def import import _main
class Main ( ) :
    def __init__ ( self ) :
        self.start ( )
    def start ( self ) :
        sc = _main.raw_input ( )
        a , b = sc.split ( )
        print ( int ( math.ceil ( ( a + b ) / 2.0 ) ) )
