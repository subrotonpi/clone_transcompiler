def _unpack ( a , ln ) : return _unpack ( a , ln )
def _unpack ( a , ln ) :
    n = int ( ln )
    if n < 0 or r > n :
        return 0
    if r > n / 2 :
        r = n - r
    return ( ( _unpack ( '>' , a ) [ 0 ] * _unpack ( '>' , r ) [ 0 ] ) * _unpack ( '>' , a ) [ 0 ] )
def _unpack ( a , ln ) :
    r = int ( ln )
    if r < 0 or r > n :
        r = n - r
    return ( ( _unpack ( '>' , a ) [ 0 ] ) * _unpack ( '>' , a ) [ 0 ] )
def _unpack ( a , ln ) :
    c = next ( a )
    if c == 'a' : raise InputError ( )
    if c >= numchars :
        try :
            numchars = a.read ( 1 )
        except IndexError :
            raise InputError ( )
    else :
        c = next ( a )
    return c
def _unpack ( a , ln ) :
    c = next ( a )
    if c < '0' or c > '9' : raise InputError ( )
    res *= 10
    res += c - '0'
    c = next ( a )
    if c == '-' :
        sgn = - 1
    else :
        sgn = 0
    res = 0
    while c < '9' :
        res *= 10
        res += c - '0'
        c = next ( a )
    return res * sgn
def _unpack ( a , ln ) :
    if a > 0 : raise InputError ( )
    res *= 10
    res += a - '0'
    c = next ( a )
    if c == ' ' or c == '\n' or c == '\r' or c == - 1 :
        return 0
    def _interface ( ch ) :
        return ch
return _unpack ( '>' , _unpack ( '>' , _unpack ( '>' , a ) ) [ 0 ] )
