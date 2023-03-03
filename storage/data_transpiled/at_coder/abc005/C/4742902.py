def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        self.T = int ( self.T )
        self.N = int ( self.N )
        self.tako = [ 0 ] * ( 200 + 1 )
        for i in range ( self.N ) :
            start = self.start
            self.tako [ start ] += 1
        self.M = int ( self.M )
        for i in range ( self.M ) :
            self.comeT = self.M
            for i in range ( max ( 0 , self.comeT - self.T ) + 1 ) :
                if self.tako [ i ] :
                    self.tako [ i ] -= 1
                    break
                if i == self.comeT :
                    self.tako [ i ] -= 1
                    return
        self.tako [ i ] = self.tako [ i ]
