def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    a , b = randint ( 1 , 10000 )
    if a <= b :
        print ( a )
    else :
        print ( a - 1 )
    sleep ( 1 )
