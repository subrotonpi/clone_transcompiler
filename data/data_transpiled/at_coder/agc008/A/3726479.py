def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.y = sys.stdin.read ( )
        self.ans = sys.maxint
        if self.x <= self.y :
            self.ans = min ( self.ans , abs ( self.x - self.y ) )
        if - 1 * self.x <= self.y :
            self.ans = min ( self.ans , abs ( - 1 * self.x - self.y ) + 1 )
        if self.x <= - self.y :
            self.ans = min ( self.ans , abs ( self.x + self.y ) + 1 )
        if - 1 * self.x <= - 1 * self.y :
            self.ans = min ( self.ans , abs ( self.y - self.x ) + 2 )
        print ( self.ans )
        return
