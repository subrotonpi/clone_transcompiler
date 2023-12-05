def main ( ) :
    import sys
    from math import log
    from math import pi
    from math import sin , cos , pi
    from math import log
    from math import pi
    from math import log
    from math import pi
    from math import sin , pi
    from math import pi
    from math import log
    from math import pi
    from math import log
    n = pi
    mod = 1000000007
    dp = [ 1 , 1 ] * 2 * n + [ 0 ]
    dp [ 0 ] = 1
    dp [ 1 ] = 1
    dp [ 1 ] = 1
    dp [ 2 ] = 2
    for i in range ( 2 , len ( dp ) ) :
        dp [ i ] = ( dp [ i - 2 ] + mod ) % mod
        dp [ i ] = ( dp [ i ] + dp [ i ] ) % mod
    res = 0
    for i in range ( n - 1 ) :
        res = ( res + dp [ i ] * ( n - 1 ) % mod ** 2 ) % mod
    res = ( res + dp [ n - 1 ] * ( n - 1 ) % mod ) % mod
    for i in range ( n - 1 ) :
        coef = i + 2
        if i == n - 2 :
            coef -= 1
        res = ( res + dp [ i ] * coef % mod ) % mod
    res = ( res + dp [ n - 1 ] ) % mod
    print ( res )
