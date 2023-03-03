def main ( ) :
    import sys
    from random import randint
    from math import ceil
    from math import sin , cos , cos , log
    A = randint ( 1 , 5 )
    B = randint ( 1 , 5 )
    C = randint ( 1 , 5 )
    X = randint ( 1 , 5 )
    Y = randint ( 1 , 5 )
    res = sys.maxint
    for i in range ( 0 , max ( X , Y ) + 1 ) :
        total = i * ( 2 * C ) + A * max ( 0 , X - i ) + B * max ( 0 , Y - i )
        res = min ( res , total )
    print ( res )
