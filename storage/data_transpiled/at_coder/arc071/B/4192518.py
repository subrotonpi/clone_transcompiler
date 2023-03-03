def import _cal
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000007
        self.n , self.m = self.n , self.m
        x = [ ]
        for i in range ( self.n ) :
            x.append ( self.n )
        y = [ ]
        for i in range ( self.m ) :
            y.append ( self.m )
        a , b = [ ] , [ ]
        for i in range ( self.n - 1 ) :
            a.append ( x [ i + 1 ] - x [ i ] )
        for i in range ( self.m - 1 ) :
            b.append ( y [ i + 1 ] - y [ i ] )
        res = _cal ( a ) * _cal ( b ) % mod
        print ( res )
    def cal ( a ) :
        mod = 1000000007
        res = 0
        for i in range ( len ( a ) ) :
            coef = long ( i + 1 ) * ( len ( a ) - i ) % mod
            res = ( res + coef * a [ i ] % mod ) % mod
        return res
