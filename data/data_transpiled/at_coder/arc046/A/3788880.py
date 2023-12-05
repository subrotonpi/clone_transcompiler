def main ( args ) :
    import sys
    from os.path import join
    from os import urandom
    from random import randint
    from sys import stdin
    N = randint ( 1 , 10000 )
    ans = ""
    if N % 9 != 0 :
        for i in range ( N // 9 + 1 ) :
            ans += N % 9
    else :
        for i in range ( N // 9 ) :
            ans += 9
    print ( ans )
