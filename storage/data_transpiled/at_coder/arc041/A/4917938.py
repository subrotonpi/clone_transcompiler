def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.x , self.y , self.k = args
        print ( self.x + ( self.y < self.k ) )
