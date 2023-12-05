def main ( ) :
    import sys
    from os import path
    from os import urandom
    from random import randint
    from time import sleep
    N = randint ( 1 , 1200 )
    if N < 1200 :
        print ( "ABC" )
    elif N < 2800 :
        print ( "ARC" )
    else :
        print ( "AGC" )
