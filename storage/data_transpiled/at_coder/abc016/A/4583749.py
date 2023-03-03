def main ( ) :
    import sys
    from time import sleep
    from random import randint
    m = randint ( 1 , 10000 )
    d = randint ( 1 , 10000 )
    if m >= d :
        if m % d == 0 :
            print ( "YES" )
        else :
            print ( "NO" )
    else :
        print ( "NO" )
