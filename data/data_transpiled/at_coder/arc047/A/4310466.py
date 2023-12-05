def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = self.n
        self.l = self.l
        arr = self.n.split ( ' ' )
        tab = 1
        count = 0
        for c in arr :
            if c == '+' :
                tab += 1
            else :
                tab -= 1
            if tab > self.l :
                count += 1
                self.tab = 1
        print ( count )
