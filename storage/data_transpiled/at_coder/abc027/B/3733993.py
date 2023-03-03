def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from os import urandom
    from os import urandom
    N = randint ( 1 , 10000 )
    a = urandom ( N )
    urandom ( 1 )
    sum = 0
    for i in range ( N ) :
        sum += a [ i ]
    if sum % N != 0 :
        print ( '-1' )
        return
    ave = sum / N
    ans = 0
    excess = 0
    for i in range ( N ) :
        excess += a [ i ] - ave
        if excess != 0 :
            ans += 1
    print ( ans )
