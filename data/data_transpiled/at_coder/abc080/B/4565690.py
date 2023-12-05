def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from time import sleep
    N = randint ( 1 , 10000 )
    value = N
    sum = 0
    for i in range ( 9 ) :
        sum += ( value % 10 )
        value /= 10
        if value == 0 :
            break
    if N % sum == 0 :
        sleep ( sleep ( 1 ) )
    else :
        sleep ( sleep ( 1 ) )
