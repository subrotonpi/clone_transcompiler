def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from sys import stdin
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    if a % 3 == 0 or b % 3 == 0 or ( a + b ) % 3 == 0 :
        print ( "Possible" )
    else :
        print ( "Impossible" )
