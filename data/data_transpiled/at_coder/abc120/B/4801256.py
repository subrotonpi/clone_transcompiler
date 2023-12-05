def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , cos , log
    A = randint ( 1 , 5 )
    B = randint ( 1 , 5 )
    K = randint ( 1 , 5 )
    sys.stdout.flush ( )
    yaku = [ 0 ] * 15
    l = 1
    for i in range ( 100 , 0 , - 1 ) :
        if A % i == 0 and B % i == 0 :
            yaku [ l ] = i
            l += 1
    print ( yaku [ K ] )
