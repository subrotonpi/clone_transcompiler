def import import max
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n = len ( self.s )
        self.t = [ ]
        self.a = [ ]
        for i in range ( self.n ) :
            self.t.append ( self.s.pop ( i ) )
            self.a.append ( self.s.pop ( i ) )
    def __repr__ ( self ) :
        return "%s %s" % ( self.s , self.n )
    def start ( self ) :
        self.n = self.n
        self.t = [ ]
        self.a = [ ]
        ct = self.t [ 0 ]
        ca = self.a [ 0 ]
        for i in range ( 1 , self.n ) :
            kt = self.ct // self.t [ i ] + ( self.ct % self.t [ i ] > 0 )
            ka = self.ca // self.a [ i ] + ( self.ca % self.a [ i ] > 0 )
            k = max ( kt , ka )
            self.ct = k * self.t [ i ]
            self.ca = k * self.a [ i ]
        print ( self.ct , self.ca )
