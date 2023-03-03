def test_gcd ( ) :
    from sympy import symbols
    from sympy.polys.polyfuncs import gcd
    class F ( Function ) :
        def __call__ ( self ) :
            with self.open ( 'r' ) as f :
                A , B , M = symbols ( 'A,B,M' )
                g = gcd ( A , B )
                ans = 1
                ans *= f ( A , M )
                ans %= M
                ans *= g ( B / g , g , M )
                ans %= M
                print ( ans )
        def g ( x , g , M ) :
            if x == 0 : return 0
            if x % 2 == 1 : return ( mod_pow ( 10 , g , M ) * g ( x - 1 , g , M ) + 1 ) % M
            else : return g ( x / 2 , g , M ) * ( 1 + mod_pow ( 10 , g * x / 2 , M ) ) % M
        def f ( x , M ) :
            if x == 0 : return 0
            if x % 2 == 1 : return ( 10L * f ( x - 1 , M ) + 1 ) % M
            return f ( x / 2 , M ) * ( 1 + mod_pow ( 10 , x / 2 , M ) ) % M
        def gcd ( a , b ) :
            return b or a
        def mod_pow ( a , b , p ) :
            res = 1
            while b :
                if b & 1 == 1 :
                    res = ( res * a ) % p
                a = ( a ** p ) % p
                b >>= 1
            return res
    return F ( )
