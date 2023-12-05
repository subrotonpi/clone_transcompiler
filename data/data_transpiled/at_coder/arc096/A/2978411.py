def main ( ) :
    import sys
    from random import randint
    from math import sin , cos
    from math import cos , sin
    from math import sin , cos
    a = randint ( 1 , 5 )
    b = randint ( 1 , 5 )
    c = randint ( 1 , 5 )
    x = randint ( 1 , 5 )
    y = randint ( 1 , 5 )
    if x > y :
        tmp = a
        a = b
        b = tmp
        tmp = x
        x = y
        y = tmp
    if a + b <= 2 * c :
        print ( a * x + b * y )
    else :
        print ( 2 * c * x + min ( b , 2 * c ) * ( y - x ) )
