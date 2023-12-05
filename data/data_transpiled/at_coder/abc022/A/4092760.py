def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.s = int ( sys.stdin.read ( ) )
        self.t = int ( sys.stdin.read ( ) )
        self.w = 0
        self.count = 0
        for i in range ( self.n ) :
            self.w += self.w
            if self.w >= self.s <= self.t :
                self.count += 1
        print ( self.count )
