def main ( ) :
    import sys
    from time import sleep
    from random import randint
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    k = randint ( 1 , 10000 )
    if k % 2 == 1 :
        print ( b - a )
    else :
        print ( a - b )
