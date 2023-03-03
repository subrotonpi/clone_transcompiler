def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.X = sys.stdin.read ( )
        self.material = [ ]
        for i in range ( self.N ) :
            self.material.append ( sys.stdin.read ( ) )
            self.X -= self.material [ i ]
    def main ( self ) :
        self.material = [ ]
        self.count = self.N
        for i in range ( self.N ) :
            self.count += self.X / self.material [ i ]
            self.X -= ( self.X / self.material [ i ] ) * self.material [ i ]
        print ( self.count )
