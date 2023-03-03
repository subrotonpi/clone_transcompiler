def main ( ) :
    import sys
    from random import randint
    from math import sin , cos
    from math import sin , cos
    from math import cos , sin
    n , min = randint ( 1 , 100 ) , min
    for i in range ( n ) :
        min = min ( min , sin ( i ) )
    print ( min )
