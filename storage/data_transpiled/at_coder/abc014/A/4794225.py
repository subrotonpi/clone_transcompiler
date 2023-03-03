def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    stdin.close ( )
    splited = a // b
    toBuy = 0
    if a % b != 0 :
        toBuy = ( splited + 1 ) * b - ( splited * b + a % b )
    print ( toBuy )
