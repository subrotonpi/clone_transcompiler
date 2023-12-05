def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.count ( 'N' )
    def run ( self ) :
        self.max = 0
        total = 0
        for i in range ( self.N ) :
            p = sys.argv.get ( i )
            total += p
            if self.max < p :
                self.max = p
        print ( total - self.max + self.max / 2 )
