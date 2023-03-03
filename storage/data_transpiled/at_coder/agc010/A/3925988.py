def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    N = int ( sys.stdin.read ( ) )
    A_ = [ ]
    odd = 0
    even = 0
    for i in range ( N ) :
        A_.append ( log ( i ) )
        if A_ [ i ] % 2 == 0 :
            even += 1
        else :
            odd += 1
    flag = 1
    while odd + even > 1 :
        while odd > 1 :
            odd -= 2
            even += 1
        while even > 1 :
            even -= 1
        if odd == 1 and even == 1 :
            flag = - 1
            break
    if flag == 1 :
        print ( "YES" )
    else :
        print ( "NO" )
