def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    a = randint ( 1 , 500 )
    b = randint ( 1 , 500 )
    if a % 500 <= b :
        print ( "Yes" )
    else :
        print ( "No" )
