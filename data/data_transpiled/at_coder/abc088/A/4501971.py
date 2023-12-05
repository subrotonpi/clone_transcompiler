def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    from random import randint
    from sys import stdin
    N = randint ( 1 , 10000 )
    M = randint ( 1 , 10000 )
    if N % 500 == 0 or N % 500 <= M :
        print ( "Yes" )
    else :
        print ( "No" )
