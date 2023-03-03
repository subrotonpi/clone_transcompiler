def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.y = sys.stdin.read ( )
        self.x = max ( self.x , self.y )
        self.y = max ( self.x , self.y )
