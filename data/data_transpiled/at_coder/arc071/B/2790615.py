def _import ( ) : return _import ( )
class Main ( object ) :
    MOD = 1000000007
    @ staticmethod
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self._pointer = 0
    def read ( self ) :
        scanner = BetterScanner ( sys.stdin )
        n = scanner.__next__ ( )
        m = scanner.__next__ ( )
        xx = scanner.__next__ ( )
        yy = scanner.__next__ ( )
        left = 0
        for i in range ( 1 , m ) :
            a = n - 1
            a *= i
            a %= MOD
            a *= m - i
            a %= MOD
            a *= xx [ 1 ] - xx [ 0 ]
            a %= MOD
            a *= yy [ i ] - yy [ i - 1 ]
            a %= MOD
            left += a
            left %= MOD
        res = left
        prev = left
        for i in range ( 2 , n ) :
            prev *= i
            prev %= MOD
            prev *= pow ( i - 1 , MOD - 2 )
            prev %= MOD
            prev *= n - i
            prev %= MOD
            prev *= pow ( n - i + 1 , MOD - 2 )
            prev %= MOD
            prev *= xx [ i ] - xx [ i - 1 ]
            prev %= MOD
            prev *= pow ( xx [ i - 1 ] - xx [ i - 2 ] , MOD - 2 )
            prev %= MOD
            res += prev
            res %= MOD
        print ( res )
    def pow ( a , b ) :
        if b == 0 :
            return 1
        elif b % 2 == 0 :
            d = pow ( a , b // 2 )
            return ( d * d ) % MOD
        else :
            d = pow ( a , b - 1 )
            return ( a * d ) % MOD
    def __iter__ ( self ) :
        self._pointer = 0
        self._pointer = 0
        self._new_pos = 0
