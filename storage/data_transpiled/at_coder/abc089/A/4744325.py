def main ( ) :
    import sys
    from os import path
    from time import sleep
    from random import randint
    N = randint ( 1 , 10000 )
    sum = 0
    if 1 <= N <= 1000 :
        sum = N / 3
    print ( sum )
