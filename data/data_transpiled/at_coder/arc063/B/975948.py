def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n = self.t
        self.t = self.t
        self.min_ai = sys.maxint
        self.max_value = 0
        self.max_value_pairs = 0
        for ai in self.s :
            self.min_ai = min ( self.min_ai , ai )
            if ai - self.min_ai > self.max_value :
                self.max_value = ai - self.min_ai
                self.max_value_pairs = 1
            elif ai - self.min_ai == self.max_value :
                self.max_value = ai - self.min_ai
                self.max_value_pairs += 1
        print ( self.max_value_pairs )
