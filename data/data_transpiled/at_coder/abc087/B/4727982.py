def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    a = randint ( 1 , 5 )
    b = randint ( 1 , 5 )
    c = randint ( 1 , 5 )
    sum = sum ( a )
    count = 0
    for x in range ( 0 , a ) :
        for y in range ( 0 , b ) :
            for z in range ( 0 , c ) :
                if sum == 500 * x + 100 * y + 50 * z :
                    count += 1
    print ( count )
