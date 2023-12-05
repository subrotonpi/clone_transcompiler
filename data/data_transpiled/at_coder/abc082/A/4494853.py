def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.x = self.a + self.b
    def __repr__ ( self ) :
        return '%s %s %s' % ( self.a , self.b , self.x )
