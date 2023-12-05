def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n , k = sc.__next__ ( )
        print ( k * int ( math.pow ( k - 1 , n - 1 ) ) )
