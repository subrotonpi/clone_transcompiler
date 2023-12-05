def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.S = _main.S
        self.T = _main.T
        self.q = len ( _main.S )
        s = S [ 0 ]
        t = T [ 0 ]
        fs = [ 0 ] * len ( s ) + [ 1 ]
        ft = [ 0 ] * len ( t ) + [ 1 ]
        for i in range ( 1 , len ( s ) + 1 ) :
            fs [ i ] = fs [ i - 1 ] + ( 1 if s [ i - 1 ] == 'A' else 2 )
        for i in range ( 1 , len ( t ) + 1 ) :
            ft [ i ] = ft [ i - 1 ] + ( 1 if t [ i - 1 ] == 'A' else 2 )
        for a , b , c , d in _main.S :
            curS = fs [ b ] - fs [ a - 1 ]
            curT = ft [ d ] - ft [ c - 1 ]
            ans = "YES" if ( curS % 3 ) == ( curT % 3 ) else "NO"
            print ( ans )
