def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.max = 0
        self.min = 1000000000
        self.b = [ ]
        for a in sys.stdin.read ( ).split ( '\n' ) :
            self.b.append ( a )
            if self.max < self.b [ 0 ] :
                self.max = self.b [ 0 ]
            if self.b [ 0 ] < self.min :
                self.min = self.b [ 0 ]
        print ( abs ( self.max - self.min ) )
