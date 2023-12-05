def main ( ) :
    import sys
    from math import sqrt
    from math import sin , cos , cos , log
    from os import urandom
    from random import randint
    from math import sin , cos , log
    from os.path import join
    from os import urandom
    from os.path import join
    from os.path import join
    N = randint ( 1 , N )
    X = randint ( 1 , X )
    a = [ abs ( x - sin ( x ) ) for x in range ( N ) ]
    ans = sum ( a )
    for i in range ( N ) :
        tmp_ans = gcd ( a [ i ] , a [ 0 ] )
        ans = min ( ans , tmp_ans )
    out ( ans )
    def gcd ( m , n ) :
        if m < n :
            return gcd ( n , m )
        if n == 0 :
            return m
        return gcd ( n , m % n )
    return gcd
