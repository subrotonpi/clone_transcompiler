def main ( ) :
    import sys
    from os import path
    from os import urandom
    from random import randint
    from time import sleep
    N = randint ( 1 , 10000 )
    flg = True
    if N < 4 :
        print ( "No" )
    else :
        for i in range ( 30 ) :
            if not flg :
                break
            for j in range ( 30 ) :
                if N == 7 * i + 4 * j :
                    print ( "Yes" )
                    flg = False
                    break
        if flg :
            print ( "No" )
