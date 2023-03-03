def _import ( ) :
    from math import pow
    from numpy import pi
    from numpy.core import zeros
    from numpy.core import in
    from numpy.core import in
    from numpy.core import in
    from numpy.core import in
    from numpy.core import in
    W , H = symbols ( 'W, H' )
    size = 10000000
    fact = [ ]
    inv = [ 1 ]
    mod = 1000000007
    for i in range ( 1 , size ) :
        fact.append ( ( fact [ i - 1 ] * i ) % mod )
        inv.append ( power ( fact [ i ] , int ( mod ) - 2 ) % mod )
    n = W + H - 2
    k = W - 1
    out ( fact [ n ] % mod * inv [ k ] % mod * inv [ n - k ] % mod )
    def power ( x , n ) :
        mod = 1000000007
        ans = 1
        while n > 0 :
            if n & 1 == 1 :
                ans = ( ans * x ) % mod
            x = ( x * x ) % mod
            n >>= 1
        return ans
    return power
