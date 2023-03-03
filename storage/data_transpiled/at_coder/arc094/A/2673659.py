def main ( ) :
    import sys
    from random import randint
    from math import ceil
    from math import log
    from math import log
    from math import log
    A = randint ( 1 , 5 )
    B = randint ( 1 , 5 )
    C = randint ( 1 , 5 )
    M = max ( A , max ( B , C ) )
    if ( A + B + C ) % 2 == M % 2 :
        print ( ( 3 * M - ( A + B + C ) ) / 2 )
    else :
        print ( ( ( 3 * M + 3 ) - ( A + B + C ) ) / 2 )
