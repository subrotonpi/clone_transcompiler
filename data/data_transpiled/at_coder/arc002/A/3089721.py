def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    N = randint ( 1 , 10000 )
    if N % 4 :
        print ( 'NO' )
    elif N % 100 == 0 and N % 400 != 0 :
        print ( 'NO' )
    elif N % 100 == 0 and N % 400 == 0 :
        print ( 'YES' )
    else :
        print ( 'YES' )
