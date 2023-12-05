def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    sc = urandom ( 1 )
    N = randint ( 1 , 10000 )
    A = randint ( 1 , 10000 )
    if ( N % 500 ) - A <= 0 :
        print ( "Yes" )
    else :
        print ( "No" )
