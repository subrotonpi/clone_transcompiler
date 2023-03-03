def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    a = randint ( 1 , 10 )
    b = randint ( 1 , 10 )
    if a + b < 10 :
        print ( a + b )
    else :
        print ( 'error' )
