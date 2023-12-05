def _solve ( ) : return _solve ( )
class A ( object ) :
    TIME = True
    def __init__ ( self , * args ) :
        self.TIME = True
    def solve ( self ) :
        n , m = self.time ( ) , self.time ( )
        is = [ 0 ] * m
        list = [ ]
        list.append ( [ 0 , n ] )
        for i in range ( m ) :
            k = self.time ( )
            is.append ( [ n , n ] )
            for j in range ( 1 , k ) :
                is [ i ] [ j ] = self.time ( ) - 1
            for j in range ( 1 , k ) :
                if is [ j ] < n :
                    list.append ( is [ j ] )
        list.sort ( )
        N = len ( list )
        res = ZERO
        for i in range ( N - 1 ) :
            s , t = list [ i ] , list [ i + 1 ]
            if s < t :
                dp = [ ZERO ] * m
                fill ( dp , ZERO )
                dp [ 0 ] = ONE
                for j in range ( m ) :
                    num = _lower_bound ( is [ j ] , t )
                    a = _valueOf ( num )
                    b = _valueOf ( n - num )
                    for k in range ( m , 0 , - 1 ) :
                        dp [ k ] = dp [ k ] * b + dp [ k - 1 ] * a
                    dp [ 0 ] = dp [ 0 ] * b
                tmp = ZERO
                for j in range ( 0 , m ) :
                    a = _valueOf ( j )
                    a = a * a
                    tmp = tmp + a * dp [ j ]
                res = res + tmp * _valueOf ( t - s )
        return res
