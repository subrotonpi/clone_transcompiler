def main ( ) :
    from time import sleep
    from math import log
    from math import sin , cos , exp
    from os.path import join
    from os import path
    from os import urandom
    w = int ( urandom ( 1 ) )
    h = int ( urandom ( 2 ) )
    a = 1
    b = 1
    mod = 1000000007
    for i in range ( 1 , h ) :
        a = a * ( w - 1 + i ) % mod
        b = b * i % mod
    ans = a * ( func ( b , mod - 2 , mod ) ) % mod
    print ( ans )
    def func ( a , b , mod ) :
        if b == 0 :
            return 1
        if b % 2 == 0 :
            return func ( a * a % mod , b // 2 , mod )
        else :
            return a * func ( a , b - 1 , mod ) % mod
    return func
