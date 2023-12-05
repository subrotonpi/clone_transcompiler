def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x , self.y , self.sum = sys.stdin.read ( ).split ( '\n' )
        self.x , self.y = self.x , self.y
        self.sum = self.x + ( self.y / 2 )
        print ( self.sum )
