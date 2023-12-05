def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from sys import stdin
    A = randint ( 1 , 10000 )
    B = randint ( 1 , 10000 )
    C = randint ( 1 , 10000 )
    X = randint ( 1 , 10000 )
    count = 0
    for a in range ( 0 , A ) :
        for b in range ( 0 , B ) :
            for c in range ( 0 , C ) :
                if ( 500 * a + 100 * b + 50 * c ) == X :
                    count += 1
    print ( count )
