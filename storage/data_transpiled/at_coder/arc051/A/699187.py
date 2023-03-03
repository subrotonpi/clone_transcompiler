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
            if self.x1 - self.x2 >= self.x1 + self.x3 <= self.y1 - self.y2 >= self.y1 + self.y3 <= self.y3 :
                print ( "NO" )
            else :
                print ( "YES" )
            if self.dis ( self.x1 , self.y1 , self.x2 , self.y2 ) <= self.r :
                print ( "NO" )
            else :
                print ( "YES" )
        def dis ( self , x1 , y1 , x2 , y2 ) :
            return math.sqrt ( self.x1 - self.x2 )
    return Main ( )
