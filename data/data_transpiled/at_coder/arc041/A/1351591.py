def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.y = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
    def run ( self ) :
        self.x = x
        self.y = y
        self.k = k
        ans = None
        if self.y < self.k :
            ans = self.x + self.y - ( self.k - self.y )
        else :
            ans = self.x + self.k
        print ( ans )
