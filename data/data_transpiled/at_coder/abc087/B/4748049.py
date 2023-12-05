def main ( ) :
    import sys
    from random import randint
    from time import sleep
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    x = randint ( 1 , 10000 )
    sum = 0
    for i in range ( 0 , a ) :
        for j in range ( 0 , b ) :
            for k in range ( 0 , c ) :
                way = i * 500 + j * 100 + k * 50
                if way == x :
                    sum += 1
    print ( sum )
    sleep ( 1 )
