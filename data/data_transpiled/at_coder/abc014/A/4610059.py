def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = 0
    if a % b == 0 :
        print ( '0' )
    else :
        c = a % b
        print ( b - c )
