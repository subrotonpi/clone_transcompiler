def main ( ) :
    import sys
    from os import urandom
    from random import randint
    N = randint ( 1 , 500 )
    A = randint ( 1 , 500 )
    if N % 500 == 0 :
        print ( "Yes" )
    else :
        N = N % 500
        if N < A :
            print ( "Yes" )
        else :
            print ( "No" )
