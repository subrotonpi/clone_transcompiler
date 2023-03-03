def _main ( ) :
    from math import pow , sqrt , sqrt , log
    from numpy import array , abs , abs
    class Main ( object ) :
        def solve ( self ) :
            with self._lock :
                a = array ( [ [ 0 , 1 ] , [ 0 , 1 ] ] )
                b = array ( [ [ 0 , 0 ] , [ 1 , 0 ] ] )
                m = a.shape [ 0 ]
                mt1 = [ [ 10 % m , 1 ] , [ 0 , 1 ] ]
                oneA = mxvector ( mxnthpow ( mt1 , a ) , [ [ 0 ] , [ 1 ] ] ) [ 0 ] [ 0 ]
                gcd = GCD ( a , b )
                d = b // gcd
                mt2 = [ [ pow ( 10 , gcd ) , 1 ] , [ 0 , 1 ] ]
                oneF = mxvector ( mxnthpow ( mt2 , d ) , [ [ 0 ] , [ 1 ] ] ) [ 0 ] [ 0 ]
                print ( ( oneA * oneF ) % m )
        def LCM ( a , b ) :
            gcd = GCD ( a , b )
            resA = a // gcd
            resB = b // gcd
            return gcd * resA * resB
        def LCM ( a , b ) :
            if b > a :
                d = a
                a = b
                b = d
            if b == 0 : return a
            return GCD ( b , a % b )
        def mxproduct ( a , b ) :
            ans = [ [ 1 , 0 ] , [ 0 , 1 ] ]
            aa = a
            while a [ 0 ] :
                for j in range ( a [ 0 ] ) :
                    for k in range ( a [ 1 ] ) :
                        ans [ i ] [ j ] += ( a [ i ] [ k ] * b [ k ] [ j ] ) % m
                        ans [ i ] [ j ] %= m
            return ans
    return Main ( )
