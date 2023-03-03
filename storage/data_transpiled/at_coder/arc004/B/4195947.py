def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.max = 0
        self.sum = 0
        for i in range ( self.n ) :
            d = sys.stdin.read ( )
            if self.max < d :
                self.max = d
            self.sum += d
        print ( self.sum )
        rest = self.sum - self.max
        if rest >= self.max :
            print ( 0 )
        else :
            print ( self.max - rest )
