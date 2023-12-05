def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.core import zeros
    from numpy.core import linalg
    from numpy.core import eigs
    T = randint ( 1 , N )
    A = [ ]
    for i in range ( N ) :
        A.append ( linalg.eigs ( A ) )
    M = randint ( 1 , N )
    B = [ ]
    for i in range ( M ) :
        B.append ( linalg.eigs ( B ) )
    r = 0
    if len ( A ) >= len ( B ) :
        c = 0
        for i in range ( len ( B ) ) :
            for j in range ( c , len ( A ) ) :
                if B [ i ] - A [ j ] <= T and 0 <= B [ i ] - A [ j ] <= T :
                    c = j + 1
                    r += 1
                    break
    if r == len ( B ) :
        print ( 'yes' )
    else :
        print ( 'no' )
