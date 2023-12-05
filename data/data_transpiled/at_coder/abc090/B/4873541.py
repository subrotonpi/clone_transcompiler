def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from math import sin , cos , cos , log
    A = randint ( 1 , 10000 )
    B = randint ( 1 , 10000 )
    ans = 0
    for i in range ( A , B + 1 ) :
        s = i / 10000
        t = i / 1000 - s * 10
        u = i % 10
        v = ( i % 100 - u ) / 10
        if s == u and t == v :
            ans += 1
    print ( ans )
