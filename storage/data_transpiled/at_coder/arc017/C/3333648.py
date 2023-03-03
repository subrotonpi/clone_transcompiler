def main ( ) :
    import sys
    from collections import defaultdict
    from random import randint
    from time import sleep
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = randint ( 1 , 10000 )
    x = randint ( 1 , 10000 )
    a = [ ]
    for i in range ( n ) :
        a.append ( i )
    a.sort ( )
    map1 = defaultdict ( int )
    map2 = defaultdict ( int )
    zen = n // 2
    c = 1
    for i in range ( zen ) :
        c *= 2
    for i in range ( c ) :
        d = i
        v = 0
        for j in range ( zen ) :
            if d % 2 == 0 :
                v += a [ j ]
            d /= 2
        if v in map1 :
            map1 [ v ] = map1 [ v ] + 1
        else :
            map1 [ v ] = 1
    c = 1
    for i in range ( zen ) :
        c *= 2
    for i in range ( c ) :
        d = i
        v = 0
        for j in range ( zen ) :
            if d % 2 == 0 :
                v += a [ j ]
            d /= 2
        if v in map2 :
            map2 [ v ] = map2 [ v ] + 1
        else :
            map2 [ v ] = 1
    res = 0
    seen = map ( lambda x : x - lo , map1 )
    for lo in seen :
        if x - lo in map2 :
            res += map1 [ lo ] * map2 [ x - lo ]
    print ( res )
