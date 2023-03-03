def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    n = randint ( 1 , n )
    m = randint ( 1 , n )
    box = [ 0 ] * n
    can = [ 1 ] * n
    box [ 0 ] = 1
    box [ 1 ] = 1
    for i in chain ( range ( m ) , repeat ( n ) ) :
        x = randint ( - 1 , 1 )
        y = randint ( - 1 , 1 )
        if can [ x ] == 1 and box [ x ] > 1 :
            can [ y ] = 1
        if can [ x ] == 1 and box [ x ] == 1 :
            can [ x ] = 0
            can [ y ] = 1
        box [ x ] -= 1
        box [ y ] += 1
    ans = 0
    for i in chain ( range ( n ) , repeat ( n ) ) :
        if can [ i ] == 1 :
            ans += 1
    print ( ans )
