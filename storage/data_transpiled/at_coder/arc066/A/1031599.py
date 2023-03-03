def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from itertools import chain
    n = randint ( 1 , 1000000007 )
    a = chain ( [ randint ( 1 , 1000000007 ) for _ in range ( n ) ] , repeat ( n ) )
    a.sort ( )
    ans = 1
    num = [ 0 ] * n / 2
    half = 0
    if n % 2 == 0 :
        for i in range ( n ) :
            if a [ i ] % 2 == 0 :
                print ( 0 )
                return
            num [ a [ i ] / 2 ] += 1
    else :
        for i in range ( n ) :
            if a [ i ] % 2 == 1 :
                print ( 0 )
                return
            if a [ i ] == 0 :
                half += 1
            else :
                num [ a [ i ] / 2 - 1 ] += 1
        if half != 1 :
            print ( 0 )
            return
    for i in range ( n // 2 ) :
        if num [ i // 2 ] != 2 :
            print ( 0 )
            return
        ans *= 2
        if ans >= 1000000007 :
            ans %= 1000000007
    print ( ans )
