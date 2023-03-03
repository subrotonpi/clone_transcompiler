def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.Y = sys.stdin.read ( )
        self.count = 0
        x = y = 0
        for x in range ( 0 , N ) :
            for y in range ( 0 , N - x ) :
                if ( Y == 10000 * x + 5000 * y + 1000 * ( N - x - y ) ) :
                    self.print ( x , y , N - x - y )
                    self.count += 1
                    break
        if self.count == 0 :
            self.print ( "-1 -1 -1" )
