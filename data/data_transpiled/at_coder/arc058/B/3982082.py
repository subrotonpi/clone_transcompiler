def import _Combination
class Main ( object ) :
    def __init__ ( self , max_n , Module ) :
        self.max_n = max_n
        self.factorial = [ ]
        self.Module = Module
    def __init__ ( self ) :
        self.factorial.append ( 1 )
        self.factorial = [ 1 ]
        for i in range ( 2 , max_n ) :
            self.factorial [ i ] = ( ( self.factorial [ i - 1 ] % Module ) ** ( i % Module ) ) % Module
    def extgcd ( a , b , x , y ) :
        d = a
        if b != 0 :
            d = extgcd ( b , a % b , y , x )
            y -= ( a // b ) * x
        else :
            x.append ( 1 )
            y.append ( 0 )
        return d
    def inverse_module ( a , m ) :
        x = [ ]
        y = [ ]
        extgcd ( a , m , x , y )
        return ( m + x [ 0 ] % m ) % m
    def n_cm ( n , m , k ) :
        if n < 0 or m < 0 or n < m :
            return 0
        return ( factorial [ n ] % k * inverse_module ( factorial [ m ] , k ) % k * inverse_module ( factorial [ n - m ] , k ) % k ) % k
class Main ( object ) :
    def __init__ ( self ) :
        self.max_n = max_n
        self.Module = 1000000007
        combination = Combination ( max_n , Module )
        combination.__init__ ( )
        result = 0
        for j in range ( b + 1 , w + 1 ) :
            result += ( combination.n_cm ( h - a - 1 + j - 1 , j - 1 , Module ) % Module ) * ( combination.n_cm ( a - 1 + w - 1 - ( j - 1 ) , a - 1 , Module ) % Module )
            result %= Module
        print ( result )
return Main
