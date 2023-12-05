def main ( ) :
    import sys
    from math import pow
    from random import randint
    n = randint ( 1 , 10000 )
    min = 0
    for i in range ( 1 , 100000 ) :
        pow = pow ( i , 2 )
        if pow > n :
            break
        min = pow
    print ( int ( min ) )
