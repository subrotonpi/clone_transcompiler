def main ( ) :
    import sys
    from time import sleep
    from random import randint
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    cnt = 0
    if a == b and b == c :
        if a % 2 == 1 :
            print ( 0 )
            return
        print ( - 1 )
        return
    while True :
        if a % 2 == 1 or b % 2 == 1 or c % 2 == 1 :
            break
        atmp = a
        btmp = b
        ctmp = c
        a , b , c = ( btmp + ctmp ) // 2 , ( atmp + ctmp ) // 2 , ( atmp + btmp ) // 2 , ( atmp + btmp ) // 2
        cnt += 1
    print ( cnt )
