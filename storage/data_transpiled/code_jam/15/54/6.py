def _import ( ) :
    from itertools import chain
    class D ( object ) :
        def __init__ ( self ) :
            self.P = int ( self.P )
            self.F = [ ]
            self.D = D
        def main ( self ) :
            self.T = self.T
            for i in range ( 1 , T + 1 ) :
                ans = self.solve ( )
                print ( "Case #%d:" % i )
                for a in ans :
                    print ( " %d" % a )
                print ( )
    def solve ( self ) :
        self.P = int ( self.P )
        self.E = [ ]
        self.F = [ ]
        self.sum_F = 0
        self.d = { }
        for i in range ( self.P ) :
            self.E.append ( self.P [ i ] )
            self.d [ E [ i ] ] = i
        for i in range ( self.P ) :
            self.F.append ( self.F [ i ] )
            self.sum_F += self.F [ i ]
        ans = [ ]
        for i in range ( self.P ) :
            for j in range ( self.P ) :
                if not self.F [ j ] :
                    continue
                if self.check ( self , j ) :
                    ans.append ( self.E [ j ] )
                    break
        return ans
    def check ( self , pos ) :
        revert = self.f [ pos ]
        v = self.E [ pos ]
        ok = True
        if v < 0 :
            for i in range ( self.P - 1 , - 1 , - 1 ) :
                if not self.f [ i ] :
                    continue
                n = self.E [ i ] + v
                if n not in self.d :
                    ok = False
                    break
                idx = self.d [ n ]
                if self.f [ idx ] < self.f [ i ] :
                    ok = False
                    break
                self.f [ idx ] -= self.f [ i ]
        elif v > 0 :
            for i in range ( self.P ) :
                if self.f [ i ] :