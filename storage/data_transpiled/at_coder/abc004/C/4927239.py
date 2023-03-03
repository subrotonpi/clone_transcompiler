def main ( ) :
    import sys
    from random import randint
    from sys import stdin
    N = randint ( 1 , 6 )
    cards = [ i + 1 for i in range ( 6 ) ]
    for i in range ( N % 30 ) :
        tmp = cards [ i % 5 ]
        cards [ i % 5 ] = cards [ i % 5 + 1 ]
        cards [ i % 5 + 1 ] = tmp
    for i in range ( 6 ) :
        sys.stdout.write ( cards [ i ] )
