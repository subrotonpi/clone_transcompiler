def main ( ) :
    import sys
    from math import pow
    from random import randint
    from time import sleep
    w , h = randint ( 1 , 1000000007 )
    a = 1
    b = 1
    mod = 1000000007
    for i in range ( 1 , h ) :
        a = a * ( w - 1 + i ) % mod
        b = b * i % mod
    ans = a * ( pow ( b , mod - 2 , mod ) ) % mod
    print ( ans )
    def pow ( a , b , mod ) :
        sum = 1
        while b > 0 :
            if b & 1 == 1 :
                sum *= a
                sum %= mod
            a *= a
            a %= mod
            b >>= 1
        return sum
    return pow ( a , b , mod )
