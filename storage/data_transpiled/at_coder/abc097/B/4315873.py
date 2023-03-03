def main ( ) :
    import sys
    from math import pow
    from random import randint
    x = randint ( 1 , 10 )
    max = 0
    for i in range ( 1 , x + 1 ) :
        for j in range ( 2 , 10 ) :
            num = randint ( i , j )
            if num > x :
                break
            if num > max :
                max = num
    print ( max )
