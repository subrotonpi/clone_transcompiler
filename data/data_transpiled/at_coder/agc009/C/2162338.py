def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.A , self.B = _main.get ( self.N )
        self.S = [ ]
        self.findIndex ( self.S )
    def findIndex ( self ) :
        left , right = 0 , self.N + 1
        while right - left > 1 :
            center = ( left + right ) // 2
            if self.S [ center ] >= self.B :
                left = center
            else :
                right = center
        return left
    def main ( self ) :
        self.N = self.N
        self.A = self.A
        self.B = self.B
        self.S = [ ]
        self.sum = [ 1 ]
        self.S.append ( - B )
        for i in range ( 1 , self.N + 1 ) :
            self.S.append ( self.S [ i ] )
        lindex = - 1
        mod = long ( 1e9 ) + 7
        if self.A > self.B :
            a , A , B = self.A , self.B , self.A
        for i in range ( 2 , self.N + 1 ) :
            if self.S [ i ] - self.S [ i - 2 ] < self.A :
                print ( 0 )
                return
            for i in range ( 1 , self.N + 1 ) :
                if self.S [ i ] - self.S [ i - 1 ] < self.A :
                    index = findIndex ( self.S [ i ] )
                    dp = ( index >= lindex and ( self.sum [ findIndex ( self.S [ i ] ) ] - ( lindex >= 0 ) ) + mod ) % mod or 0
                    self.sum [ i ] = ( self.sum [ i - 1 ] + dp ) % mod
                    lindex = i - 2
                elif self.S [ i ] - self.S [ i - 1 ] < self.B :
                    index = findIndex ( self.S [ i ] )
                    dp = ( index >= lindex and ( self.sum [ findIndex ( self.S [ i ] ) ] - ( lindex >= 0 ) ) + mod or