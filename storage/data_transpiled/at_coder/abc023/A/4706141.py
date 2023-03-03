def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.X = sys.stdin.read ( )
        self.sum = 0
        self.X += self.X [ 0 ] - '0'
        self.sum += self.X [ 1 ] - '0'
        print ( self.sum )
