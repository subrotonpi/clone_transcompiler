def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from itertools import chain
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    if a + b == c or b + c == a or c + a == b :
        print ( "Yes" )
    else :
        print ( "No" )
