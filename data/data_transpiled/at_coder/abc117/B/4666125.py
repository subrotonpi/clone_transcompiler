def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.max = 0
        self.sum = 0
        for i in range ( self.n ) :
            tmp = sys.stdin.read ( )
            if self.max < tmp :
                self.max = tmp
            self.sum += tmp
        print ( self.max < ( self.sum - self.max ) and 'Yes' or 'No' )
