def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.D = sys.stdin.read ( )
        self.X = sys.stdin.read ( )
        self.count = 0
        for i in range ( self.N ) :
            A = sys.stdin.read ( )
            x = 0
            while x * A + 1 <= D :
                self.count += 1
                x += 1
        print ( self.X , self.count )
