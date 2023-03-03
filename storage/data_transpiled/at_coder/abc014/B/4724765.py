def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.X = int ( sys.stdin.read ( ) )
        self.a = [ ]
        for i in range ( self.n ) :
            self.a.append ( sys.stdin.read ( ) )
        self.sum = 0
        for i in range ( self.n ) :
            if self.X & ( 1 << i ) :
                self.sum += self.a [ i ]
        print ( self.sum )
