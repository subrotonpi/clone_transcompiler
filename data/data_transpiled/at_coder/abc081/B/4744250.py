def main ( ) :
    import sys
    from random import randint
    from time import sleep
    N = randint ( 1 , 10000 )
    min = 100
    for i in range ( N ) :
        sum = 0
        a = randint ( 1 , N )
        while a % 2 == 0 :
            a = a // 2
            sum = sum + 1
        if min > sum :
            min = sum
    print ( min )
    sleep ( 1 )
