def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    d = a % b
    if d > 0 :
        print ( b - d )
    else :
        print ( '0' )
