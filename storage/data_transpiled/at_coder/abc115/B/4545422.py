def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.sum = 0
        self.max_p = 0
        for i in range ( self.n ) :
            p = sys.stdin.read ( )
            self.sum += p
            if p > self.max_p :
                self.max_p = p
        self.sum -= self.max_p / 2
    print ( self.sum )
