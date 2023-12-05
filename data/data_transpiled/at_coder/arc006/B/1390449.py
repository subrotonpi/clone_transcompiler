def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
        self.L = self.L
        self.move = [ [ - 1 ] for i in range ( self.L ) ]
        self.pass = 0
        self.Scanner.__init__ ( self )
        for s in self.Scanner.__init__ ( self ) :
            sp = s.split ( )
            self.index = - 1
            for st in sp :
                for k in st :
                    if k == '|' : self.index += 1
                    if k == '-' :
                        self.move [ self.index ] [ self.index ] = self.index + 1
                        self.move [ self.index + 1 ] [ self.index ] = self.index
    s = self.Scanner.__init__ ( self )
    self.pass = s.count ( 'o' ) / 2
    pos = self.pass
    step = self.L - 1
    while step >= 0 :
        if self.move [ step ] [ pos ] >= 0 :
            pos = self.move [ step ] [ pos ]
        step -= 1
    print ( pos + 1 )
