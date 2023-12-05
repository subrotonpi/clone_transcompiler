def main ( args ) :
    import sys
    from os.path import join
    from os import urandom
    from random import randint
    from random import randint
    from sys import stdin
    N = randint ( 1 , 10000 )
    A = randint ( 1 , 10000 )
    if ( N % 500 <= A ) :
        print ( "Yes" )
    else :
        print ( "No" )
