def main ( ) :
    import sys
    from random import randint
    from time import sleep
    n = randint ( 1 , 10000 )
    a = 0
    ans = 0
    for i in range ( n ) :
        a = randint ( 1 , 10000 )
        while a % 2 == 0 :
            a //= 2
            ans += 1
    sleep ( 1 )
    print ( ans )
