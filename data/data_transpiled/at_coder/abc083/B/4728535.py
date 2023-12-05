def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    n = randint ( 1 , 10000 )
    x = randint ( 1 , 10000 )
    y = randint ( 1 , 10000 )
    sum = 0
    for a in range ( 0 , 9 ) :
        for b in range ( 0 , 9 ) :
            for c in range ( 0 , 9 ) :
                for d in range ( 0 , 9 ) :
                    for e in range ( 0 , 9 ) :
                        if ( n >= 10000 * a + 1000 * b + 100 * c + 10 * d + e ) and ( x <= a + b + c + d + e ) and ( y >= a + b + c + d + e ) :
                            sum = sum + ( 10000 * a + 1000 * b + 100 * c + 10 * d + e )
    print ( sum )
