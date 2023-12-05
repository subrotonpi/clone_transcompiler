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
            self.x = [ x2 , x2 , x3 , x3 ]
            self.y = [ y2 , y3 , y2 , y3 ]
            if self.x2 <= x1 - self.r and self.x3 >= self.x1 + self.r and self.y2 <= y1 - self.r and self.y3 >= self.y1 + self.r :
                print ( "NO" )
            else :
                print ( "YES" )
            for i in range ( 4 ) :
                if ( self.x [ i ] - self.x1 ) ** 2 + self.y [ i ] - self.y1 ** 2 > self.r ** 2 :
                    print ( "YES" )
                    return
            print ( "NO" )
            self.x2 = None
            self.y2 = None
            self.x3 = None
            self.y3 = None
