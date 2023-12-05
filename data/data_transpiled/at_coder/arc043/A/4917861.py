def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.n , self.a , self.b = args
        s = _main ( self.n )
        d = np.max ( s ) - np.min ( s )
        print ( - 1 if d == 0 else b / d , a - np.average ( s ) * b / d )
