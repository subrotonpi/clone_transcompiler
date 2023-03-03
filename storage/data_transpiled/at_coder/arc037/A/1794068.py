def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from os import urandom
    n = randint ( 1 , 10000 )
    m = [ sin ( i ) for i in range ( n ) ]
    ans = 0
    for i in range ( n ) :
        if m [ i ] < 80 :
            ans += 80 - m [ i ]
    print ( ans )
