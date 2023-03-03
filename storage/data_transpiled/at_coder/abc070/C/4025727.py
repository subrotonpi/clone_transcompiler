def main ( ) :
    import sys
    from time import sleep
    from random import randint
    N = randint ( 1 , 10000 )
    A = randint ( 1 , 10000 )
    for i in range ( N - 1 ) :
        B = randint ( 1 , 10000 )
        a = A
        b = B
        while a % b != 0 :
            tmp = a
            a , b = b , tmp % b
        A = A / b * B
    print ( A )
