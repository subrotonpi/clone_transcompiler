def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.maxint
        self.y = sys.maxint
        self.ans = abs ( abs ( x ) - abs ( y ) )
        if ( self.x < 0 and self.y > 0 ) or ( self.x >= 0 and self.y <= 0 ) :
            self.ans += 1
        elif self.x > y :
            self.ans += 2
        print ( self.ans )
