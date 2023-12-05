def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x1 , self.y1 , self.r , self.x2 , self.y2 , self.x3 , self.y3 = sys.argv [ 1 : ]
            print ( self.x2 <= x1 - self.r and x1 + self.r <= x3 and self.y2 <= y1 - self.r and y1 + self.r <= y3 )
            print ( self.inside ( x1 , y1 , self.r , x2 , self.y2 ) and self.inside ( x1 , y1 , self.r , x2 , self.y3 ) and self.inside ( x1 , y1 , self.r , x3 , self.y2 ) and self.inside ( x1 , y1 , self.r , x3 , self.y3 ) )
    def inside ( x0 , y0 , r , x1 , y1 ) :
        return ( x1 - x0 ) ** 2 + ( y1 - y0 ) ** 2 <= r ** 2
