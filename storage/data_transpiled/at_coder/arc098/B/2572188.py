def _import ( ) :
    from math import sin , cos , log
    from os import urandom
    from random import randint
    from math import sin , cos , log
    n = randint ( 1 , 100000000000000 )
    a = range ( n )
    sum = 0
    ans = 0
    xsum = 0
    r = 0
    for l in range ( n ) :
        if l != 0 :
            xsum ^= a [ l - 1 ]
            sum -= a [ l - 1 ]
        while 1 :
            if r >= n :
                ans += r - l
                break
            xsum ^= a [ r ]
            sum += a [ r ]
            if xsum != sum :
                ans += r - l
                xsum ^= a [ r ]
                sum -= a [ r ]
                break
            r += 1
    log ( ans )
