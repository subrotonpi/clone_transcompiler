def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    from sys import stdin
    n = randint ( 1 , 10000 )
    boo = False
    while n > 0 :
        if n % 4 == 0 :
            boo = True
            break
        elif n % 7 == 0 :
            boo = True
            break
        else :
            n -= 7
    if boo :
        print ( "Yes" )
    else :
        print ( "No" )
