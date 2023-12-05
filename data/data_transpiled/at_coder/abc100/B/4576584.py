def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from math import sin , cos , cos , pi
    D = randint ( 1 , 100 )
    N = randint ( 1 , 100 )
    ans = 0
    if D == 0 and N >= 100 :
        ans = 101
    elif D == 0 and N < 100 :
        ans = N
    elif D == 1 and N >= 100 :
        ans = 101 * 100
    elif D == 1 and N < 100 :
        ans = N * 100
    elif D == 2 and N >= 100 :
        ans = 101 * 10000
    elif D == 2 and N < 100 :
        ans = N * 10000
    print ( ans )
