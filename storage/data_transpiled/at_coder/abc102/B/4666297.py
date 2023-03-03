def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import sin , cos
    from math import log
    max , min = 0 , 1000000000
    n = randint ( 1 , 10000 )
    a = 0
    for i in range ( n ) :
        a = randint ( 1 , 10000 )
        if max < a :
            max = a
        if min < a :
            min = a
    print ( max - min )
    sleep ( 1 )
