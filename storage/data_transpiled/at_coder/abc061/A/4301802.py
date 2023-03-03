def main ( args ) :
    import sys
    from os.path import join
    from os import urandom
    from random import randint
    from random import choice
    A = randint ( 1 , 10000 )
    B = randint ( 1 , 10000 )
    C = randint ( 1 , 10000 )
    if A <= C <= B :
        print ( "Yes" )
    else :
        print ( "No" )
