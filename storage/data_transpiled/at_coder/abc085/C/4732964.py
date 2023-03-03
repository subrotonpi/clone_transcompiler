def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    N = randint ( 1 , 10000 )
    Y = randint ( 1 , 10000 )
    urandom.close ( )
    for x in range ( 0 , N ) :
        for y in range ( 0 , N - x ) :
            if 10000 * x + 5000 * y + ( N - x - y ) * 1000 == Y :
                print ( x , y , N - x - y )
                return
    print ( '-1 -1 -1' )
