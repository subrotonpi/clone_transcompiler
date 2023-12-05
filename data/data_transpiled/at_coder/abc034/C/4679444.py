def _import ( ) :
    import sys
    import random
    from math import factorial
    from math import log
    from math import factorial
    from math import log
    from math import factorial
    from math import log
    from math import log
    from math import factorial
    from math import log
    W = factorial ( )
    H = factorial ( )
    prime = 1_000_000_007
    out = factorial ( W - 1 , H - 1 , prime )
    def combination_mod ( w , h , prime ) :
        n = w + h
        fac = [ 0 ] * ( n + 1 )
        finv = [ 0 ] * ( n + 1 )
        inv = [ 0 ] * ( n + 1 )
        fac [ 0 ] = fac [ 1 ] = 1
        finv [ 0 ] = finv [ 1 ] = 1
        inv [ 1 ] = 1
        for i in range ( 2 , n + 1 ) :
            fac [ i ] = fac [ i - 1 ] * i % prime
            inv [ i ] = prime - inv [ int ( prime % int ( i ) ) ] * ( prime / i ) % prime
            finv [ i ] = finv [ i - 1 ] * inv [ i ] % prime
        return fac [ w + h ] * ( finv [ w ] * finv [ h ] % prime ) % prime
    return combination_mod
