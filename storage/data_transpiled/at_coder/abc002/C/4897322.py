def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.xa , self.ya , self.xb , self.yb , self.xc , self.yc = args
        self.print ( abs ( ( xb - xa ) * ( yc - ya ) - ( yb - ya ) * ( xc - xa ) ) / 2 )
