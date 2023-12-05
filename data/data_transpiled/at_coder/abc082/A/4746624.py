def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    if ( a + b ) % 2 == 0 :
        print ( ( a + b ) / 2 )
    else :
        print ( ( a + b ) / 2 + 1 )
    sleep ( 1 )
