def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.screen = sys.stdout
        self.H = self.screen.size
        self.W = self.screen.size
        print ( ( self.W - 1 ) * self.H + ( self.H - 1 ) * self.W )
