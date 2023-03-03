def main ( ) :
    import sys
    from os import urandom
    from random import randint
    A , B , C = randint ( 1 , 3 ) , randint ( 1 , 3 ) , randint ( 1 , 3 )
    if A + B < C :
        print ( "No" )
    else :
        print ( "Yes" )
    sys.exit ( 0 )
