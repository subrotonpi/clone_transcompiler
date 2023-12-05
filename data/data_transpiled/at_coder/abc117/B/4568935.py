def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.sum = 0
        self.max_l = 0
        for i in range ( self.n ) :
            l = sys.stdin.readline ( )
            self.sum += l
            if l > self.max_l :
                self.max_l = l
        print ( 'Yes' if ( self.sum - self.max_l ) > self.max_l else 'No' )
