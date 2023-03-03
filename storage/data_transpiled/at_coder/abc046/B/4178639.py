def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        k = sc.__next__ ( )
        print ( k * ( long ( math.pow ( k - 1 , n - 1 ) ) ) )
