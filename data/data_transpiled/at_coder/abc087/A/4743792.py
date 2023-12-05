def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from itertools import chain
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    nokori = a
    nokori -= b
    kaeru = True
    while kaeru == True :
        if nokori >= c :
            nokori -= c
        else :
            kaeru = False
    print ( nokori )
