def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    a = randint ( 1 , 5 )
    b = randint ( 1 , 5 )
    c = randint ( 1 , 5 )
    x = randint ( 1 , 5 )
    sum = 0
    answer = 0
    for i in range ( 0 , a ) :
        for j in range ( 0 , b ) :
            for k in range ( 0 , c ) :
                sum = ( i * 500 + j * 100 + k * 50 )
                if sum == x :
                    answer += 1
    print ( answer )
