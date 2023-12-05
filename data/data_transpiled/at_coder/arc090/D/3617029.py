def __main ( ) :
    from math import pow
    from os import urandom
    s = urandom ( 1 )
    mod = 1000000007
    res = 0
    divs = divs ( s )
    for i in divs :
        kosu = s // i
        if i < 8 :
            continue
        res = ( res + mod_pow ( 10 , i - 1 , mod ) * 9 % mod - kosu ) % mod
    sum = [ 0 ] * 30000000
    are = 1
    keta = 1
    for i in range ( 1 , len ( sum ) ) :
        if i == are * 10 :
            are = i
            keta += 1
        sum [ i ] = sum [ i - 1 ] + keta
    right = 1
    for left in range ( 1 , 10000000 ) :
        while ( sum [ right ] - sum [ left - 1 ] ) < s :
            right += 1
        if ( sum [ right ] - sum [ left - 1 ] ) == s :
            res += 1
    res += s / 8
    print ( res % mod )
    def divs ( x ) :
        res = [ ]
        size = 0
        for i in range ( 1 , x ** 2 + 1 ) :
            if x % i == 0 :
                res.append ( i )
        for i in range ( size - 1 , - 1 , - 1 ) :
            if res [ i ] * res [ i ] == x :
                continue
            res.append ( x // res [ i ] )
        res = [ x // res [ i ] for i in range ( size ) ]
        return res
    def mod_pow ( a , b , mod ) :
        res = 1
        c = a
        while b > 0 :
            if b % 2 == 1 :
                res = ( res * c ) % mod
            c = ( c * c ) % mod
            b //= 2
        return res
    return divs
