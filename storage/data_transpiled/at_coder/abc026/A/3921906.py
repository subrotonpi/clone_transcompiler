def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.max = 0
        for x in range ( 1 , 100 ) :
            for y in range ( 1 , 100 ) :
                if self.A == x + y :
                    self.max = max ( x * y , self.max )
        print ( self.max )
