def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import maxsize
    n = randint ( 1 , 10000 )
    if n % 2 == 0 :
        print ( n )
        return
    print ( 2 ** n )
