def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
    def __call__ ( self , * args ) :
        self.N = int ( self.N )
        a = _main ( * args )
        print ( min ( abs ( N - a ) , 10 - max ( N , a ) + min ( N , a ) ) )
