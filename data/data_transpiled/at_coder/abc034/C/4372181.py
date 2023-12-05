def main ( ) :
    from random import randint
    from time import sleep
    from random import randint
    from time import sleep
    from random import randint
    from random import choice
    M = 1_000_000_007
    W , H = randint ( 1 , M )
    print ( choose ( W + H - 2 , W - 1 , M ) )
    def choose ( n , k , mod ) :
        if k > n - k :
            return choose ( n , n - k , mod )
        res = 1
        for i in range ( k ) :
            res = ( res * ( n - i ) ) % mod
        for i in range ( 1 , k + 1 ) :
            res = ( res * inverse ( i , mod ) ) % mod
        return res % mod
    def inverse ( a , mod ) :
        return modpow ( a , mod - 2 , mod )
    def modpow ( a , n , mod ) :
        res = 1
        while n :
            if n % 2 == 1 :
                res = ( res * a ) % mod
            a = ( a ** n ) % mod
            n >>= 1
        return res % mod
    return choose
