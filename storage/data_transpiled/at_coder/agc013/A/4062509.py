def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import radians
    from math import log
    from math import log
    N = randint ( 1 , 10000 )
    ans = 0
    start = randint ( 1 , 10000 )
    up = False
    down = False
    for i in range ( 1 , N ) :
        a = randint ( 1 , 10000 )
        if start == a :
            continue
        if start > a :
            if up :
                ans += 1
                down = False
                up = False
            else :
                down = True
        else :
            if down :
                ans += 1
                up = False
                down = False
            else :
                up = True
        start = a
    print ( ans + 1 )
