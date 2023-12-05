def main ( ) :
    import sys
    from random import randint
    from time import sleep
    n = randint ( 1 , 10000 )
    ans = 999
    for i in range ( n , 1000 ) :
        a = randint ( 100 , 100 )
        b = randint ( 10 , 10 )
        c = randint ( 10 , 10 )
        if a == b and b == c and c == a :
            ans = i
            break
    print ( ans )
    sleep ( 1 )
