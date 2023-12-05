def main ( ) :
    import sys
    from random import randint
    from time import sleep
    n = randint ( 1 , 10000 )
    ans = 0
    for i in range ( n ) :
        a = randint ( 1 , 10000 )
        if a % 2 == 0 :
            while a % 2 == 0 and a >= 2 :
                a /= 2
                ans += 1
    print ( ans )
