def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.t = sys.argv.index ( 't' )
        self.tmp1 = sys.argv.index ( 'tmp1' )
        self.tmp2 = sys.argv.index ( 'tmp2' )
        self.output = 0
        for i in range ( 1 , n ) :
            self.output += min ( self.t , self.tmp2 - self.tmp1 )
            if i != n - 1 :
                self.tmp1 = self.tmp2
                self.tmp2 = self.tmp2
        self.output += self.t
        print ( self.output )
