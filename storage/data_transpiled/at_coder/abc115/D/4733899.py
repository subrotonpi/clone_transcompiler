def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        X = sc.__next__ ( )
        layers = [ 1 ] * 100
        paties = [ 1 ] * 100
        layers.append ( 1 )
        paties.append ( 1 )
        for i in range ( 1 , N + 1 ) :
            layers [ i ] = layers [ i - 1 ] * 2L + 3
            paties [ i ] = paties [ i - 1 ] * 2L + 1
        print ( _paty ( N , X , layers , paties ) )
    def paty ( N , X , layers , paties ) :
        if X == 0 :
            return 0
        if N == 0 :
            return 1
        if X < layers [ N - 1 ] + 2 :
            return _paty ( N - 1 , X - 1 , layers , paties )
        else :
            return paties [ N - 1 ] + 1 + _paty ( N - 1 , X - layers [ N - 1 ] - 2 , layers , paties )
