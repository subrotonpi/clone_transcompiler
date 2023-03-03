def _import ( ) : return not ( c >= 33 and c <= 126 )
def _import ( ) : return _import ( )
INPUT = ''
mod = 1_000_000_007
inf = float ( 'inf' ) / 2
def _solve ( ) :
    n = _nl ( )
    s = _nl ( )
    mid = long ( math.sqrt ( n ) )
    ans = inf
    for i in range ( 1 , mid + 1 ) :
        ret = _calc_coef_sum ( n , i )
    for i in range ( 1 , mid + 1 ) :
        map = _calc_coef_sum ( n , i )
    for i in range ( 1 , mid + 1 ) :
        tmp = n - s
        if tmp <= 0 : continue
        if ( tmp % i ) != 0 : continue
        l = i + 1
        r = tmp / i + 1
        ret1 = _calc_coef_sum ( n , l )
        ret2 = _calc_coef_sum ( n , r )
        if ret1 == s : ans = min ( ans , l )
        if ret2 == s : ans = min ( ans , r )
    if n == s :
        ans = min ( ans , n + 1 )
    _stdout ( ans == inf )
def _calc_coef_sum ( n , b ) :
    ret = 0
    if b <= 1 : return - 1
    while n > 0 :
        ret += n % b
        n /= b
    return ret
def _eval ( ) :
    stdin = sys.stdin if INPUT == '' else StringIO ( INPUT )
    stdout = sys.stdout
    s = time.time ( )
    _solve ( )
    stdout.flush ( )
    if not INPUT == '' :
        _tr ( time.time ( ) - s + 'ms' )
def _eval ( ) :
    def _eval ( ) :
        stdin = sys.stdin if INPUT == '' else StringIO ( INPUT )
        stdout = sys.stdout
        s = time.time ( )
        _eval ( )
        stdout.flush ( )
        if not INPUT == '' :
            _eval ( )
        return stdin
