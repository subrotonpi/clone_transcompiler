def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.max = 0
        self.min = sys.maxint
        for i in range ( self.n ) :
            tmp = sys.stdin.read ( )
            self.max = max ( self.max , tmp )
            self.min = min ( self.min , tmp )
        print ( self.max - self.min )
