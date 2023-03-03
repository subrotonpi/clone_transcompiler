def main ( ) :
    import math
    from os import urandom
    from math import sqrt
    from math import sqrt
    N = urandom ( 1 )
    a = int ( math.sqrt ( N ) )
    ans = 100000000
    for i in range ( 1 , a + 1 ) :
        b = 1000000000
        c = 1000000000
        if N % i == 0 :
            b = N / i
            c = i
        lb = len ( str ( b ) )
        lc = len ( str ( c ) )
        if max ( lb , lc ) < ans :
            ans = max ( lb , lc )
    print ( ans )
