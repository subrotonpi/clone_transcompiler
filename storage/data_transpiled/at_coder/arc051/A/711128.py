def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.cx , self.cy , self.r , self.sx1 , self.sy1 , self.sx2 , self.sy2 = _main.get ( )
        self.visibleCircle = not ( self.inSquare ( self.cx + self.r , self.cy ) and self.inSquare ( self.cx - self.r , self.cy ) and self.inSquare ( self.cx , self.cy + self.r ) and self.inSquare ( self.cx , self.cy - self.r ) )
        self.visibleSquare = not ( self.inCircle ( self.sx1 , self.sy1 ) and self.inCircle ( self.sx2 , self.sy1 ) and self.inCircle ( self.sx1 , self.sy2 ) and self.inCircle ( self.sx2 , self.sy2 ) )
        print ( self.visibleCircle and 'YES' or 'NO' )
        print ( self.visibleSquare and 'YES' or 'NO' )
    def inCircle ( self , x , y ) :
        dx = self.cx - x
        dy = self.cy - y
        return dx * dx + dy * dy <= r * r
    def inSquare ( self , x , y ) :
        return ( self.sx1 <= x <= x <= sx2 ) and ( self.sy1 <= y <= y <= sy2 )
