def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.a = 0
        for i in range ( self.n ) :
            self.a += self.a - 1
        print ( self.a )
