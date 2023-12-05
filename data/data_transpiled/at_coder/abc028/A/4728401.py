def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    from random import choice
    N = randint ( 1 , 10000 )
    if N <= 59 :
        print ( 'Bad' )
    elif N <= 89 :
        print ( 'Good' )
    elif N <= 99 :
        print ( 'Great' )
    elif N == 100 :
        print ( 'Perfect' )
