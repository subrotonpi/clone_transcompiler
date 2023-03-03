def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    N = randint ( 1 , N )
    A = randint ( 1 , N )
    B = randint ( 1 , N )
    if ( B - A ) % 2 == 0 :
        print ( 'Alice' )
    else :
        print ( 'Borys' )
