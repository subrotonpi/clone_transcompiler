def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.S = _main ( )
        self.length = 0
        self.res = 0
        for s in S :
            if s in [ 'A' , 'G' , 'T' , 'C' ] :
                self.length += 1
            else :
                if self.res < self.length :
                    self.res = self.length
                self.length = 0
        if self.res < self.length :
            self.res = self.length
        print ( self.res )
