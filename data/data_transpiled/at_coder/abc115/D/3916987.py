def import _recrec
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        X = self.X
        self.X = X
        self.p = [ ]
        self.l = [ ]
        self.p.append ( 1 )
        self.l.append ( 1 )
        for i in range ( 1 , N + 1 ) :
            self.p [ i ] = 2 * self.p [ i - 1 ] + 1
            self.l [ i ] = 2 * self.l [ i - 1 ] + 3
        ans = self.rec ( N , X )
        print ( ans )
    def rec ( self , n , x ) :
        if n == 0 :
            return 1
        if x <= 1 :
            return 0
        elif x < self.l [ n - 1 ] + 1 :
            return self.rec ( self.n - 1 , x - 1 )
        elif x == self.l [ n - 1 ] + 1 :
            return self.p [ n - 1 ]
        elif x == self.l [ n - 1 ] + 2 :
            return self.p [ n - 1 ] + 1
        elif x < self.l [ n ] :
            return self.rec ( self.n - 1 , x - ( self.l [ n - 1 ] + 2 ) ) + self.p [ n - 1 ] + 1
        else :
            return 2 * self.p [ n - 1 ] + 1
