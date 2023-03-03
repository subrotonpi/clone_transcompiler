def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from itertools import chain
    a = urandom ( 16 )
    b = urandom ( 16 )
    c = int ( a + b )
    heihoukon = False
    for i in chain ( [ a , b ] , chain ( [ a , b ] , [ c ] ) ) :
        if i * i == c :
            heihoukon = True
    if heihoukon == True :
        print ( "Yes" )
    elif heihoukon == False :
        print ( "No" )
