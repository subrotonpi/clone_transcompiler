def main ( ) :
    import sys
    from numpy.linalg import norm
    from numpy.random import randint
    N = randint ( 1 , N )
    M = randint ( 1 , M )
    map = [ [ a , b ] for a , b in zip ( range ( N ) , range ( M ) ) ]
    points = [ [ c , d ] for c , d in zip ( range ( M ) , range ( M ) ) ]
    for a , b in map :
        point = - 1
        min = float ( 'inf' )
        for j in range ( M ) :
            c , d = points [ j ]
            km = abs ( a - c ) + abs ( b - d )
            if min > km :
                point = j + 1
                min = km
        print ( point )
