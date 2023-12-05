def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , log
    from math import log
    from math import sin , cos , log
    from math import log
    from math import sin , cos , log
    n = randint ( 1 , 1000000000 )
    min = 1000000000
    for i in range ( n ) :
        a = sin ( a )
        count = 0
        while a % 2 == 0 :
            a = a / 2
            count += 1
        min = min ( min , count )
    print ( min )
