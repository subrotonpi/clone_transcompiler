def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.S = int ( self.S )
        self.T = int ( self.T )
        self.W = int ( self.W )
        self.now = self.W
        self.ans = 1 if self.W <= self.T else 0
        for i in range ( self.N - 1 ) :
            a = _main ( self.now )
            self.W += a
            if self.S <= self.W <= self.T :
                self.ans += 1
        print ( self.ans )
