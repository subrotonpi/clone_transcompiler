def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    if a + b < 24 :
        print ( a + b )
    elif a + b > 24 :
        print ( a + b - 24 )
    else :
        print ( 0 )
