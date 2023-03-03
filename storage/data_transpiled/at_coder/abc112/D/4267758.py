def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , cos , log
    n = randint ( 1 , 10000 )
    m = randint ( 1 , 10000 )
    log ( 1 , n )
    ans = 1
    for i in range ( 1 , 2 * n + 1 ) :
        if m % i != 0 :
            continue
        if i >= n :
            ans = max ( ans , m // i )
        elif m // i >= n :
            ans = max ( ans , i )
    print ( ans )
