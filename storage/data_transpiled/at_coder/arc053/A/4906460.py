def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.h , self.w = args [ 0 ] , args [ 1 ]
        print ( self.h * ( self.w - 1 ) + ( self.h - 1 ) * self.w )
