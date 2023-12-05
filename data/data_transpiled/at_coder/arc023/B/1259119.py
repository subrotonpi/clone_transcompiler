def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , cos , log
    from math import log
    from math import log
    R = randint ( 1 , R )
    C = randint ( 1 , C )
    D = randint ( 1 , D )
    a = [ [ sin ( i ) for i in range ( R ) ] for j in range ( C ) ]
    max = 0
    for i in range ( R ) :
        for j in range ( C ) :
            if ( i + j ) <= D and ( i + j ) % 2 == D % 2 :
                max = max ( max , a [ i ] [ j ] )
    print ( max )
