def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.pop ( 0 )
    def __call__ ( self ) :
        self.n = sys.argv.pop ( 0 )
        x = self.n
        sum = 0
        while x > 2 :
            x = x - 3
            sum += 1
        print ( sum )
