def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        l = [ ]
        min = sys.maxint
        for i in range ( n ) :
            l.append ( sc.__next__ ( ) )
            min = min ( min , l [ i ] )
        gcd = 0
        for i in range ( n ) :
            gcd = gcd ( gcd , l [ i ] - min )
        print ( pow ( 2 , min + ( gcd + 1 ) / 2 ) )
    def MOD ( n , m ) :
        if m == 0 :
            return n
        else :
            return gcd ( m , n % m )
    def pow ( a , n ) :
        loop = n
        ret = 1
        x = a
        while loop > 0 :
            if loop % 2 == 1 :
                ret = ret * x % MOD
            x = x * x % MOD
            loop /= 2
        return ret
