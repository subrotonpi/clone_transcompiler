def main ( ) :
    import sys
    from random import randint
    r = randint ( 1 , 10 )
    g = randint ( 1 , 10 )
    b = randint ( 1 , 10 )
    if ( g * 10 + b ) % 4 == 0 :
        print ( "YES" )
    else :
        print ( "NO" )
