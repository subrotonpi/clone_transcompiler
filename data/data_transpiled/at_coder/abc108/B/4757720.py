def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.x1 = _main.x
        self.y1 = _main.y
        self.x2 = _main.x
        self.y2 = _main.y
    def __call__ ( self , x1 , y1 , x2 , y2 ) :
        x = x2 - x1
        y = y2 - y1
        print ( ( x2 - y ) , ( y2 + x ) , ( x1 - y ) , ( y1 + x ) )
