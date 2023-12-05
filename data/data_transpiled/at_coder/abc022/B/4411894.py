def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.po = { }
        count = 0
        for i in range ( self.n ) :
            m = sys.argv.index ( 'm' )
            if m in self.po :
                count += 1
            else :
                self.po [ m ] = m
        print ( count )
