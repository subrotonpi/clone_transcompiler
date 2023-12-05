def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , log
    from os import urandom
    n = randint ( 1 , 10000 )
    k = randint ( 1 , 10000 )
    a = [ sin ( i ) for i in range ( n ) ]
    ans = 0
    sum = 0
    for i in range ( k ) :
        sum += a [ i ]
    ans += sum
    for i in range ( 1 , n - k + 1 ) :
        sum -= a [ i - 1 ]
        sum += a [ i - 1 + k ]
        ans += sum
    print ( ans )
