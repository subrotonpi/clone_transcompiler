def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from os import urandom
    n = randint ( 1 , 10000 )
    m = randint ( 1 , 10000 )
    ans = 1
    for i in range ( n ) :
        if ans < m :
            ans *= 2
        else :
            ans += m
    print ( ans )
