def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    from sys import stdin
    A , B = randint ( 1 , 10000 ) , randint ( 1 , 10000 )
    if B % A == 0 :
        print ( A + B )
    else :
        print ( B - A )
