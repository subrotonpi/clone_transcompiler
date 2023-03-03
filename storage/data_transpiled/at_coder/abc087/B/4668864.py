def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
        self.X = sys.stdin.read ( )
        self.count = 0
        for x in range ( 0 , A ) :
            for y in range ( 0 , B ) :
                if X - ( x * 500 + y * 100 + C * 50 ) <= 0 :
                    self.count += 1
        print ( self.count )
