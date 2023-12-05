def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    from itertools import chain
    n = randint ( 1 , 10000 )
    cards = chain ( range ( 100 ) , repeat ( n ) )
    alice = bob = 0
    for i in chain ( * chain ( range ( n ) , repeat ( n ) ) ) :
        cards [ i ] = chain ( * cards [ i ] )
    cards.sort ( )
    for i in range ( len ( cards ) ) :
        if i % 2 == 0 :
            bob += cards [ i ]
        else :
            alice += cards [ i ]
    print ( alice - bob )
