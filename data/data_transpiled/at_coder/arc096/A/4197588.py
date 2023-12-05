def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    a = randint ( 1 , 5 )
    b = randint ( 1 , 5 )
    c = randint ( 1 , 5 )
    x = randint ( 1 , 5 )
    y = randint ( 1 , 5 )
    min = 0
    for i in range ( 0 , 100000 ) :
        price = i * 2 * c + max ( 0 , x - i ) * a + max ( 0 , y - i ) * b
        if min > price or i == 0 :
            min = price
    print ( min )
