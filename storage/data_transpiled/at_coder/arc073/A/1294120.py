def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from time import sleep
    N = randint ( 1 , 10000 )
    T = randint ( 1 , 10000 )
    pushes = range ( N )
    sum = till = 0
    for i in range ( N ) :
        if till > pushes [ i ] :
            sum += ( pushes [ i ] - pushes [ i - 1 ] )
        else :
            sum += T
        till = pushes [ i ] + T
    print ( sum )
    sleep ( 1 )
