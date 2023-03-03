def main ( ) :
    import sys
    from random import randint
    from math import pow
    from math import sin
    from math import cos
    total , max , x = 0 , 0 , 0
    for i in range ( 3 ) :
        x = randint ( 1 , 5 )
        total += x
        if max < x :
            max = x
    print ( total - max + max * int ( pow ( 2 , x ) ) )
