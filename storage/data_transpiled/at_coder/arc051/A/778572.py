def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x1 = sys.stdin.read ( )
            self.y1 = sys.stdin.read ( )
            self.r = sys.stdin.read ( )
            self.x2 = sys.stdin.read ( )
            self.y2 = sys.stdin.read ( )
            self.x3 = sys.stdin.read ( )
            self.y3 = sys.stdin.read ( )
            if self.d ( x2 , y2 , x1 , y1 ) <= self.r ** 2 and self.d ( x3 , y2 , x1 , y1 ) <= self.r ** 2 and self.d ( x2 , y3 , x1 , y1 ) <= self.r ** 2 and self.d ( x3 , y3 , x1 , y1 ) <= self.d ( x1 , y1 , x1 , y1 ) :
                self.print ( "YES" )
                self.print ( "NO" )
            else :
                rx1 , ry1 , rx2 , ry2 , rx3 , ry3 , ry4 = self.x1 - r , self.y1 - r , self.x2 - r , self.y2 - r , self.x3 - r , self.y2 - r , self.y2 - r , self.d ( x1 , y1 , x1 , y1 ) <= self.d ( x2 , y2 , x1 , y1 ) <= self.d ( x3 , y2 , x1 , y1 ) <= self.d ( x3 , y3 , x1 , y1 ) <= self.d ( x1 , y1 , x1 , y1 ) <= self.d ( x2 , y2 , x1 , y1 ) <= self.d ( x3 , y2 , x1 , y1 , r ) <= self.d ( x3 , y3 , x1 , y1 , r ) <= self.d ( x1 , y1 , x1 , y1 , r ) <= self.d ( x2 , y2 , x1 , y1 , r ) <= self.d ( x2 , y2 , x1 , y1 , r ) <= self.d ( x2 , y2 , x1 , y1 , r ) <= self.d ( x3 , y3 , x1 , y1 , r ) <= self.d ( x2 , y2 , x1 , y1 , r ) <= self.d ( x3 , y2 , x1 , y1 , r ) <= self.d ( x3 , y3 , x1 , y1 , r ) <=