def main ( ) :
    import sys
    from random import randint
    from sys import stdin
    N = randint ( 1 , 10000 )
    bit = 0
    for i in range ( N ) :
        bit |= randint ( 1 , N )
    print ( sum ( bit ) )
