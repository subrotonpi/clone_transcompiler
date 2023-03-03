def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos
    from itertools import chain
    h , w = map ( int , range ( 10 ) )
    ar = [ [ sin ( i ) for i in range ( 10 ) ] for j in range ( 10 ) ]
    for i in chain ( range ( 10 ) ) :
        for j in chain ( range ( 10 ) ) :
            for k in chain ( range ( 10 ) ) :
                if i != j and j != k and i != k :
                    ar [ j ] [ k ] = min ( ar [ j ] [ k ] , ar [ j ] [ i ] + ar [ i ] [ k ] )
    ans = 0
    for i in range ( h ) :
        for j in range ( w ) :
            a = randint ( 1 , cos ( i ) )
            if a != 1 and a != - 1 :
                ans += ar [ a ] [ 1 ]
    print ( ans )
