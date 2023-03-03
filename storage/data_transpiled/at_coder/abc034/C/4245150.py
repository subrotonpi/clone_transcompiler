def _import ( ) : return _import ( "" )
mod = 1000000007
def main ( ) :
    sc = _FastScanner ( )
    fac = [ 1 ]
    for i in range ( 1 , 299999 ) :
        fac [ i ] = fac [ i - 1 ] * i
        fac [ i ] %= mod
    n = 0
    b = read_byte ( )
    if b == '-' :
        minus = True
        b = read_byte ( )
    elif b < '0' or b <= '9' :
        raise ValueError
    while b == - 1 or not is_printable_char ( b ) :
        return int ( minus )
    else :
        raise ValueError
    b = read_byte ( )
    if not is_printable_char ( b ) :
        return int ( minus )
def comb ( n , k ) :
    ans = fac [ n ] % mod
    mot = rev ( fac [ n - k ] ) * rev ( fac [ k ] ) % mod
    return ans * mot % mod
def rev ( k ) :
    return pow ( k , mod - 2 ) % mod
def pow ( k , i ) :
    if i == 0 :
        return 1
    else :
        if i % 2 == 0 :
            vol = pow ( k , i // 2 ) % mod
            return vol * vol % mod
        else :
            return k * pow ( k , i - 1 ) % mod
class FastScanner ( object ) :
    def __init__ ( self , buffer = bytearray ( ) ) :
        self.buffer = bytearray ( )
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( ) :
            if self.ptr < buflen :
                return True
            else :
                self.ptr = 0
                try : self.buflen = len ( buffer )
                except TypeError : pass
            if self.buflen <= 0 :
                return False
            return True
    def read ( self ) :
        if not is_printable_char ( self.buffer ) : raise StopIteration
        self.buffer = [ ]
        self.ptr = ptr
        self.buflen = 0
return FastScanner ( ).read ( )
