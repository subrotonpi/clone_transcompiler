def _import ( ) :
    from math import factorial , invfac
    class Main ( object ) :
        def __init__ ( self , factorial ) :
            self.factorial = factorial
            self.invfac = invfac
        def inverse ( self , m ) :
            res = 1
            for i in range ( 32 ) :
                if ( ( ( self.mod - 2 ) >> i ) & 1 ) == 1 :
                    res = ( res * m ) % mod
                m = ( m ** i ) % mod
            return res
        def C ( self , i , j ) :
            return ( ( ( factorial [ i ] * self.invfac [ i - j ] ) % mod ) * self.invfac [ j ] ) % mod
        def func ( self , N , j ) :
            if N == j :
                return self.factorial [ N ]
            return ( ( C ( self.j - 1 , N - self.j - 1 ) * self.factorial [ j ] ) % mod ** 2 ) % mod
        def main ( self ) :
            with open ( "/proc/sys/exit.stdin" ) as f :
                N = f.readline ( ).strip ( )
    factorial = [ 1 ] * ( N + 1 )
    for i in range ( 1 , N + 1 ) :
        factorial [ i ] = ( factorial [ i - 1 ] * i ) % mod
    invfac = [ inverse ( factorial [ i ] ) for i in range ( 0 , N + 1 ) ]
    ans = ( func ( N , ( N + 1 ) / 2 ) * ( ( N + 1 ) / 2 ) ) % mod
    for j in range ( ( N + 1 ) / 2 + 1 , N ) :
        ans = ( ans + j * ( ( func ( N , j ) - func ( N , j - 1 ) + mod ) % mod ) % mod ) % mod
    print ( ans )
