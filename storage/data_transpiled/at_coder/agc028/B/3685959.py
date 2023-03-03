def _import ( ) : return _import ( )
mod = 1000000007
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = mod
    def read ( self ) :
        sc = FastScanner ( )
        N = self.read_int ( )
        a = [ ]
        for i in range ( 1 , N + 1 ) :
            a.append ( sc.read ( ) )
        if not self.hasNext ( ) :
            raise StopIteration
        n = False
        if b == '-' :
            minus = True
            b = read_int ( )
        if b < '0' or b < '9' :
            raise ValueError
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return int ( - n )
            else :
                raise ValueError
            b = read_int ( )
        rev = [ revq ( i ) for i in range ( 1 , N + 1 ) ]
        for i in reversed ( range ( 1 , N + 1 ) ) :
            rev [ i ] = revq ( i )
        for i in reversed ( range ( 1 , N + 1 ) ) :
            rev [ i ] = ( rev [ i ] + rev [ i ] ) % mod
        ans = 0
        for i in reversed ( range ( 1 , N + 1 ) ) :
            ans += a [ i ] * ( rev [ i ] + rev [ i ] - 1 ) % mod
        for i in reversed ( range ( 1 , N + 1 ) ) :
            ans *= i
            ans %= mod
        print ( ans )
    def revq ( i ) :
        sisu = mod - 2
        I = i
        return pow ( I , sisu )
    def pow ( i , sisu ) :
        if sisu == 1 :
            return i
        if sisu % 2 == 0 :
            val = pow ( i , sisu // 2 )
            return val * val % mod
        else :
            return pow ( i , sisu - 1 ) * i % mod
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = mod
