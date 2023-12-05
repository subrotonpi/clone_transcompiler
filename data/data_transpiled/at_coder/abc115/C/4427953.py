def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    from itertools import chain
    n = len ( chain ( iterable ( range ( n ) ) , repeat ( range ( n ) ) ) )
    k = len ( chain ( iterable ( range ( n ) ) , repeat ( range ( n ) ) ) )
    h = chain ( chain ( iterable ( range ( n ) ) , repeat ( range ( n ) ) ) , repeat ( range ( n ) ) )
    h = chain ( h , repeat ( range ( n ) ) )
    min = 2000000000
    for i in range ( n - k + 1 ) :
        min = min ( h [ i + k - 1 ] - h [ i ] , min )
    print ( min )
