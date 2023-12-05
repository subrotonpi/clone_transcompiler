def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from time import sleep
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    d = randint ( 1 , 10000 )
    if b * c > a * d :
        print ( "TAKAHASHI" )
    elif b * c < a * d :
        print ( "AOKI" )
    else :
        print ( "DRAW" )
