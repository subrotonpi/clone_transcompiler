def main ( ) :
    import sys
    from os import urandom
    from random import randint
    A , B , K = randint ( 1 , 3 ) , randint ( 1 , 3 ) , randint ( 1 , 3 )
    for i in range ( A , B + 1 ) :
        if i - A < K or B - i < K :
            print ( i )
