def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def __init__ ( self ) :
        self.a = [ ]
        for i in range ( self.N ) :
            self.a.append ( i )
    def __init__ ( self ) :
        self.cnt0 = 0
        self.cnt1 = 0
        for i in range ( self.cnt0 ) :
            if i == 0 :
                self.cnt0 += 1
            if i == 1 :
                self.cnt1 += 1
        if self.cnt0 == self.cnt1 == self.cnt0 :
            self.print ( - 1 )
            return
        self.max = 0
        self.cnt0 = 0
        self.cnt1 = 0
        for i in range ( 2 * self.N ) :
            if i % self.N == 0 :
                if self.cnt1 > 0 :
                    self.max = max ( self.cnt1 , self.cnt1 )
                    self.cnt1 = 0
                self.cnt0 += 1
            if i % self.N == 1 :
                if self.cnt0 > 0 :
                    self.max = max ( self.cnt0 , self.cnt0 )
                    self.cnt0 += 1
                self.cnt1 += 1
        self.print ( ( self.max - 1 ) / 2 + 1 )
