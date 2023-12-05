def main ( ) :
    import sys
    from os import urandom
    from random import randint
    A = randint ( 1 , 10000 )
    B = randint ( 1 , 10000 )
    C = randint ( 1 , 10000 )
    D = randint ( 1 , 10000 )
    if A + B > C + D :
        print ( "Left" )
    elif A + B == C + D :
        print ( "Balanced" )
    else :
        print ( "Right" )
