def _import ( ) : return 33
class Main ( object ) :
    def __init__ ( self , * args ) :
        self.fac = [ 200001 ]
        mod = 1000000007
    def read ( self ) :
        sc = FastScanner ( )
        self.H = sc.next ( )
        self.W = sc.next ( )
        self.A = sc.next ( )
        self.B = sc.next ( )
        self.fac [ 0 ] = 1
        for i in range ( 1 , 200000 ) :
            self.fac [ i ] = ( self.fac [ i - 1 ] * i ) % mod
        ans = 0
        for i in range ( self.W - B ) :
            ans += self.comb ( self.W + self.H - self.A - 2 - i , self.H - self.A - 1 ) * self.comb ( self.A + i - 1 , self.A - 1 )
            ans %= mod
        print ( ans )
    def comb ( self , l ) :
        ans = self.fac [ ord ( l ) ]
        under = ( self.rev ( self.fac [ ord ( m ) ] ) * self.rev ( self.fac [ ord ( l ) - m ] ) ) % mod
        return ( ans * under ) % mod
    def rev ( self , l ) :
        if l == 0 :
            return 1
        return self.pow ( l , self.mod - 2 )
    def pow ( self , l ) :
        if m == 0 :
            return 1
        if m % 2 == 0 :
            val = self.pow ( l , m // 2 )
            return ( val * val ) % mod
        else :
            return ( self.pow ( l , m - 1 ) * l ) % mod
class FastScanner ( object ) :
    def __init__ ( self , * args ) :
        self.buffer = [ ]
    def ptr ( self ) :
        self.buflen = 0
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try : self.buflen = self.buflen
        except AttributeError :
            pass
