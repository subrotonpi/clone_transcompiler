def import _main
class Main ( object ) :
    def __init__ ( self , * args ) :
        self.x1 , self.y1 , self.x2 , self.y2 , self.x3 , self.y3 = args
    def __call__ ( self , * args ) :
        x1 , y1 , x2 , y2 , x3 , y3 = _main ( * args )
        aaa = abs ( ( ( x1 - x3 ) * ( y2 - y3 ) ) - ( ( x2 - x3 ) * ( y1 - y3 ) ) )
        print ( aaa / 2 )
