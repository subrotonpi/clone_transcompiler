def main ( ) :
    import sys
    from time import sleep
    from random import randint
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    cnt = 0
    for i in range ( a , b + 1 ) :
        fi = i / 10000
        on = i % 10
        fo = i / 1000 % 10
        tw = i % 100 / 10
        if fi == on and fo == tw :
            cnt += 1
    print ( cnt )
