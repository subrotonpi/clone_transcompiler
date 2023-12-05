def _import ( ) :
    import sys
    import random
    import time
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 0
            self.d = 0
            self.k = 0
            self.l = [ ]
            self.r = [ ]
            self.s = [ ]
            self.t = [ ]
            self.ans = [ ]
            for i in range ( self.n ) :
                self.l.append ( random.randint ( 0 , n ) )
                self.r.append ( random.randint ( 0 , n ) )
                self.s.append ( random.randint ( 0 , n ) )
                self.t.append ( random.randint ( 0 , n ) )
                self.ans.append ( 0 )
            for i in range ( self.n ) :
                for j in range ( self.k ) :
                    if self.l [ i ] <= self.s [ j ] <= self.r [ i ] and self.s [ j ] != self.t [ j ] :
                        if self.t [ j ] < self.s [ j ] < self.t [ j ] :
                            self.s [ j ] = self.l [ i ]
                        elif ( self.t [ j ] < self.s [ j ] <= self.t [ j ] ) or ( self.s [ j ] < self.t [ j ] <= self.r [ i ] ) :
                            self.s [ j ] = self.t [ j ]
                            self.ans.append ( i + 1 )
                        elif self.s [ j ] < self.t [ j ] and self.r [ i ] < self.t [ j ] :
                            self.s [ j ] = self.r [ i ]
        for i in range ( self.k ) :
            print ( self.ans [ i ] )
