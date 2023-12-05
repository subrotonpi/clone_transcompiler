def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , log
    from math import log
    N = randint ( 1 , 10000 )
    A = log ( 'A' )
    B = log ( 'B' )
    x = 0
    for i in range ( 1 , N + 1 ) :
        sum = 0
        n = 0
        a = i
        while a != 0 :
            n = a % 10
            sum += n
            a = ( a - n ) / 10
        if sum >= A and sum <= B :
            x = x + i
    print ( x )
