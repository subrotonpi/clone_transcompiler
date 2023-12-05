def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.t = sys.maxint
        self.total = 0
        now = sys.maxint
        for i in range ( n - 1 ) :
            next = sys.maxint
            if ( next - now ) < self.total :
                self.total += next - now
            else :
                self.total += self.total
            now = next
        self.total += self.total
        print ( self.total )
