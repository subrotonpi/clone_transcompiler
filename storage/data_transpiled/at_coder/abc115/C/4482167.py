def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        K = sc.__next__ ( )
        h = [ sc.__next__ ( ) for _ in range ( N ) ]
        h = [ i for i in h if i > K ]
        dif = sys.maxint
        for i in range ( K - 1 , N ) :
            dif = min ( dif , h [ i ] - h [ i - K + 1 ] )
        print ( dif )
