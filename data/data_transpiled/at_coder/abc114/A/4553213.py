def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from sys import stdout
    X = randint ( 1 , 4 )
    if X in [ 7 , 5 , 3 ] :
        print ( "YES" , end = ' ' )
    else :
        print ( "NO" , end = ' ' )
