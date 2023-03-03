def main ( ) :
    import sys
    from os import path
    from os import urandom
    from random import randint
    from random import randint
    from sys import stdin
    from os.path import join
    from os.path import join
    from os import path
    N = randint ( 1 , 4 )
    ans = 1
    if N in ( 1 , 2 , 4 ) :
        print ( 4 )
        sys.exit ( 0 )
    while 1 :
        if N % 2 == 0 :
            N = N // 2
            ans += 1
        else :
            N = N * 3 + 1
            ans += 1
        if N == 4 :
            break
    print ( ans + 3 )
