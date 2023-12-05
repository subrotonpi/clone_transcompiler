def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.num = sys.argv.index ( 'num' )
        self.max = None
        self.pmax = None
        temp = None
        for i in range ( self.num ) :
            temp = sys.argv.index ( 'num' )
            if self.max < temp :
                self.pmax = max
                self.max = temp
            elif temp != self.max and self.pmax < temp :
                self.pmax = temp
        print ( self.pmax )
