def _import ( ) : return ( ( ( pw [ int ( a ) ] * ipw [ int ( a ) - int ( b ) ] ) % mod ) * ipw [ int ( b ) ] ) % mod
def main ( ) :
    sc = sys.stdin
    max = 400000
    mod = 998244353
    pw = [ 1 ] * max
    ipw = [ ] * max
    modb = sympy.Symbol ( str ( mod ) )
    for i in range ( 1 , max ) :
        pw [ i ] = ( i * pw [ i - 1 ] ) % mod
    for i in range ( max ) :
        ipw [ i ] = sympy.Symbol ( str ( pw [ i ] ) ).mod_inverse ( modb ) [ 0 ]
    n , a , b , k = sc.symbols
    ans = 0
    for A in range ( 0 , n ) :
        if ( k - A * a ) % b != 0 :
            continue
        B = ( k - A * a ) // b
        if B > n or B < 0 :
            continue
        ans += ( comb ( n , A , mod , pw , ipw ) * comb ( n , B , mod , pw , ipw ) ) % mod
        ans %= mod
    print ( ans )
