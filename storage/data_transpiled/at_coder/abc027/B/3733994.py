def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from os import urandom
    N = randint ( 1 , 10000 )
    a = urandom ( N )
    sum = 0
    for i in a :
        sum += i
    if sum % N != 0 :
        print ( '-1' )
        return
    ave = sum / N
    ans = 0
    excess = 0
    for i in a :
        excess += i - ave
        if excess != 0 :
            ans += 1
    print ( ans )
