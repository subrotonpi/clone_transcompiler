def main ( args ) :
    import sys
    from math import sin , cos , log
    from os.path import join
    from os import urandom
    from random import randint
    N = randint ( 1 , N + 1 )
    a = [ ]
    ans = 0
    cnt = 1
    for i in range ( N ) :
        a.append ( randint ( 1 , N + 1 ) )
    for i in range ( 1 , N ) :
        if a [ i ] > a [ i - 1 ] :
            cnt += 1
            if i == N - 1 :
                for j in range ( 1 , cnt + 1 ) :
                    ans += j
        else :
            for j in range ( 1 , cnt + 1 ) :
                ans += j
            cnt = 1
            if i == N - 1 :
                ans += 1
    print ( ans )
