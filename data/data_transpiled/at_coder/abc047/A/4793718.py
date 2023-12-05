def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from itertools import chain
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    if a + b == c :
        print ( "Yes" )
    elif b + c == a :
        print ( "Yes" )
    elif a + c == b :
        print ( "Yes" )
    else :
        print ( "No" )
