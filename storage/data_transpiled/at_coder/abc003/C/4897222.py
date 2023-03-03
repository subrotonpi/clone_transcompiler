def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.n , self.k = args
        print ( _main ( self.n , self.k ) )
    def __getitem__ ( self , k ) :
        return self.n - self.k
