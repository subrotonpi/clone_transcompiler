def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.m = sys.stdin.read ( )
        self.l = sys.stdin.read ( )
        self.p = sys.stdin.read ( )
        self.q = sys.stdin.read ( )
        self.r = sys.stdin.read ( )
        self.ans = 0
        self.n1 = ( self.n / self.p ) * ( self.m / self.q ) * ( self.l / r )
        self.n2 = ( self.n / self.p ) * ( self.m / self.r ) * ( self.l / self.q )
        self.n3 = ( self.n / self.q ) * ( self.m / self.p ) * ( self.l / self.r )
        self.n4 = ( self.n / self.q ) * ( self.m / self.r ) * ( self.l / self.p )
        self.n5 = ( self.n / self.r ) * ( self.m / self.p ) * ( self.l / self.q )
        self.n6 = ( self.n / self.r ) * ( self.m / self.q ) * ( self.l / self.p )
        self.ans = max ( self.ans , self.n1 )
        self.ans = max ( self.ans , self.n2 )
        self.ans = max ( self.ans , self.n3 )
        self.ans = max ( self.ans , self.n4 )
        self.ans = max ( self.ans , self.n5 )
        self.ans = max ( self.ans , self.n6 )
        self.ans = max ( self.ans , self.ans )
