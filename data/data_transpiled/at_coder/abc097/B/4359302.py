def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    from math import log
    x = randint ( 1 , 2 )
    max = 1
    for i in range ( 2 , x + 1 ) :
        tmp = i * i
        while tmp <= x :
            max = max ( max , tmp )
            tmp *= i
    print ( max )
    sys.exit ( 1 )
