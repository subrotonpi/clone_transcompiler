def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    A = chain ( range ( 10 ) , repeat ( 10 ) )
    B = chain ( range ( 10 ) , repeat ( 10 ) )
    C = chain ( range ( 10 ) , repeat ( 10 ) )
    if A + B + 1 <= C :
        print ( B + B + A + 1 )
    else :
        print ( B + C )
