def import _sys
class Main ( object ) :
    mod_p = 1000000007
    inf = 1 << 61
    def __init__ ( self , n , c ) :
        Scanner ( ).__init__ ( self )
        self.n = n
        self.c = c
        self.S , self.T , self.C = [ s for s in self.S if s != 0 ]
        self.C = self.C
    def __repr__ ( self ) :
        return '%s %s %s' % ( self.n , self.c , self.S [ 0 ] , self.T [ 0 ] , self.C [ 0 ] )
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    def start ( self ) :
        self.n = n
        self.c = c
        self.S , self.T , self.C = [ s for s in self.S if s != 0 ]
        self.C = [ s for s in self.C if s != 0 ]
        self.memo = [ 0 ] * ( 200005 )
        self.counts = [ 0 ] * ( 200005 )
        for j in range ( 1 , c + 1 ) :
            [ self.memo [ i ] ] = 0
            for i in range ( self.n ) :
                if j == self.C [ i ] :
                    si = self.S [ i ]
                    ti = self.T [ i ]
                    self.memo [ 2 * si - 1 ] += 1
                    self.memo [ 2 * ti ] -= 1
            for i in range ( 1 , 200005 ) :
                self.memo [ i ] += self.memo [ i - 1 ]
            for i in range ( 2 , 200005 ) :
                if self.memo [ i ] > 0 :
                    self.counts [ i ] += 1
    self.ans = len ( self.counts )
    print ( self.ans )
