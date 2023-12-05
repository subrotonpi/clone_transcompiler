def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    n = len ( chain ( [ 0 ] , repeat ( n ) ) )
    m = len ( chain ( [ 0 ] , repeat ( n ) ) )
    towns = [ 0 ] * n
    for i in chain ( [ 0 ] , repeat ( n ) ) :
        a = chain ( [ 0 ] , repeat ( n ) )
        b = chain ( [ 0 ] , repeat ( n ) )
        towns [ a - 1 ] += 1
        towns [ b - 1 ] += 1
    for i in towns :
        print ( i )
