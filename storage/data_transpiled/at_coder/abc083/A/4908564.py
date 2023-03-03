def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.l = self.l + self.r
        self.r = self.l + self.r
        print ( 'Left' if self.l > self.r else 'Right' if self.l < self.r else 'Balanced' )
