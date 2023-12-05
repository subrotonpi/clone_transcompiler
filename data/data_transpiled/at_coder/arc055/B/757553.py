def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.K = 0
        self.memo = [ [ ] for t in range ( 2 ) ]
        for i in range ( self.N + 1 ) :
            [ memo [ t ] [ i ] ] = - 1
        print ( self.calc ( 0 , 0 , K ) )
        self.memo.append ( [ ] )
    def calc ( i , j , k ) :
        if self.memo [ i ] [ j ] [ k ] >= 0 :
            return self.memo [ i ] [ j ] [ k ]
        ans = 0
        if j == self.N :
            return 1.0 if i == 1 else 0.0
        p = 1.0 / ( j + 1 )
        if k > 0 :
            ans = p * max ( self.calc ( 0 , j + 1 , k ) , self.calc ( 1 , j + 1 , k - 1 ) ) + ( 1 - p ) * self.calc ( i , j + 1 , k )
        else :
            ans = p * self.calc ( 0 , j + 1 , k ) + ( 1 - p ) * self.calc ( i , j + 1 , k )
        return self.memo [ i ] [ j ] [ k ] = ans
