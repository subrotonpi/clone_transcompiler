def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.m , self.l , self.p , self.q , self.r , self.max = sys.maxint , sys.maxint , sys.maxint
    def __init__ ( self ) :
        self.n , self.m , self.l , self.p , self.q , self.r = self.max , 0 , 0 , 0
        self.max = max ( self.n / self.p ) * self.m / self.q
        self.max = max ( self.n / self.q )
