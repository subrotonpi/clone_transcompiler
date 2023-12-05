def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import ceil
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    A = randint ( 1 , 5 )
    B = randint ( 1 , 5 )
    C = randint ( 1 , 5 )
    X = randint ( 1 , 5 )
    Y = randint ( 1 , 5 )
    price = 0
    price += min ( 2 * C , A + B ) * min ( X , Y )
    if X > Y :
        price += ( X - Y ) * A
    else :
        price += ( Y - X ) * B
    AB = max ( X , Y ) * 2 * cos ( C )
    print ( min ( price , AB ) )
