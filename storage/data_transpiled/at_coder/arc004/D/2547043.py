def _import ( ) :
    from math import log
    from os import getenv
    from os import getenv
    from os import lbrace
    from os.path import expanduser
    from os import environ
    from os.path import expanduser
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from math
    import re
    from math import log
    from math
    import log
    debug = False
    debug2 = False
    mod = 1000000007
    f = environ.get ( 'f' , '' )
    ia = f.split ( )
    N = int ( ia [ 0 ] )
    M = int ( ia [ 1 ] )
    patterns = patterns ( N , M )
    print ( patterns )
    def inverse ( x ) :
        y = 1
        while 0 :
            y += mod
        return y // x
    def nCr ( n , r ) :
        if n < r :
            return 0
        if n - r < r :
            r = n - r
        ret = 1
        for i in range ( r ) :
            ret = ret * n % mod
            del ( ret )
            ret = ret * inverse ( i + 1 ) % mod
        return ret
    def nHr ( n , r ) :
        return nCr ( n + r - 1 , r )
    def prime_factors ( n ) :
        hm = { }
        while n % 2 == 0 :
            n /= 2
            if 2L in hm :
                hm [ 2L ] = hm [ 2L ] + 1
            else :
                hm [ 2L ] = 1
        for i in range ( 3 , math.sqrt ( n ) + 1 , 1 ) :
            if n % i == 0 :
                n /= i
                if i in hm :
                    hm [ i ] = hm [ i ] + 1
                else :
                    hm [ i ] = 1
            else :
                i += 2
        if n != 1 :
            if n in hm :
                hm [ n ] = hm [ n ] + 1
            else :
                hm [ n ] = 1
        return hm
    return