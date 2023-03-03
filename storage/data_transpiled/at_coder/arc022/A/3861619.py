def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.stat = 0
        for char in self.s :
            if stat == 0 :
                if char == 'I' or char == 'i' :
                    self.stat += 1
            elif stat == 1 :
                if char == 'C' or char == 'c' :
                    self.stat += 1
            elif stat == 2 :
                if char == 'T' or char == 't' :
                    self.stat += 1
        if stat == 3 :
            self.stat = 1
        else :
            self.stat = 2
