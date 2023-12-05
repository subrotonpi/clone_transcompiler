def main ( ) :
    import sys
    from random import randint
    from time import sleep
    sc = raw_input ( )
    n = randint ( 1 , n )
    ans = 0
    for i in range ( 3 , n + 1 , 2 ) :
        cnt = 0
        for j in range ( 1 , i + 1 ) :
            if i % j == 0 :
                cnt += 1
        if cnt == 8 :
            ans += 1
    print ( ans )
