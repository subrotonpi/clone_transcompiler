def main ( args ) :
    import sys
    from os.path import join
    from os import urandom
    from random import randint
    N = randint ( 1 , 4 )
    if N % 3 == 0 :
        print ( "YES" )
    else :
        print ( "NO" )
