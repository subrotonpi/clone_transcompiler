def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = len ( self.sc )
    def __init__ ( self ) :
        self.h = [ ]
        for i in range ( 1 , N + 1 ) :
            self.h.append ( self.sc.pop ( i ) )
        if self.N == 1 :
            self.print ( 1 )
            return
        state = self.h [ 1 ] > self.h [ 0 ]
        s = 1
        t = 1
        u = 1
        self.max = 0
        for i in range ( 2 , self.N + 1 ) :
            if self.state :
                if self.h [ i ] > self.h [ i - 1 ] :
                    t = self.h [ i ]
                    u = self.h [ i ]
                else :
                    u = self.h [ i ]
                    self.state = - self.state
            else :
                if self.h [ i ] < self.h [ i - 1 ] :
                    u = self.h [ i ]
                else :
                    self.state = - self.state
                    size = self.u - s + 1
                    self.max = max ( self.max , size )
                    s = self.s - 1
                    t = self.h [ i - 1 ]
        self.max = max ( self.u - s + 1 )
        self.print ( self.max )
