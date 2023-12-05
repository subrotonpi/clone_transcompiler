def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys._getframe ( 1 )
        a = sc.f_globals [ 'a' ]
        b = sc.f_globals [ 'b' ]
        print ( int ( math.ceil ( ( a + b ) / 2 ) ) )
