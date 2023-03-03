def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    N = randint ( 1 , N + 1 )
    M = randint ( 1 , M )
    l1 = [ - 1 for i in range ( 1 , N + 1 ) ]
    ans = 0
    for i in range ( M ) :
        ai = log ( i )
        bi = log ( i )
        l1 [ bi ] = max ( ai , l1 [ bi ] )
    right = N
    left = 0
    while 1 :
        if right == 1 :
            break
        if l1 [ right ] > 0 :
            left = l1 [ right ]
        else :
            right -= 1
            continue
        while 1 :
            if left == right :
                ans += 1
                break
            left = max ( left , l1 [ right ] )
            right -= 1
    print ( ans )
