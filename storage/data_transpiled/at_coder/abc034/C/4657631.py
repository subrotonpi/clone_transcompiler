def _import ( ) :
    from math import pow
    from math import sqrt
    from math import log
    from math import log
    from math import pow
    W = int ( sys.stdin.read ( ) )
    H = int ( sys.stdin.read ( ) )
    print ( calc ( W - 1 , H - 1 ) )
    def calc ( w , h ) :
        start = max ( w , h ) + 1
        a = 1
        b = 1
        for i in range ( start , w + h + 1 ) :
            a *= i
            b *= i - start + 1
            a = a % 1000000007l
            b = b % 1000000007l
        return a * pow ( b , 1000000005l ) % 1000000007l
    def pow ( a , n ) :
        mod = 1000000007l
        tmp = 1
        while n != 0 :
            if n % 2 == 1 :
                tmp = tmp * a % mod
                a = a * a % mod
                n //= 2
        return tmp
    return calc ( )
