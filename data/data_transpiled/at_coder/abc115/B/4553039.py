def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.count ( 'N' )
    def __init__ ( self ) :
        self.N = sys.argv.count ( 'x' )
    def __init__ ( self ) :
        self.x = [ ]
        self.max = 0
        self.sum = 0
        for i in range ( self.N ) :
            p = self.x [ i ]
            self.x.append ( p )
            self.sum += p
        self.max = self.x [ 0 ]
        for i in range ( 1 , self.N ) :
            if self.x [ i ] > self.max :
                self.max = self.x [ i ]
        print ( self.sum - self.max + self.max / 2 , end = ' ' )
