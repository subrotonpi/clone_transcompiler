def main ( ) :
    import sys
    from itertools import repeat
    from random import randint
    n = randint ( 1 , 10000 )
    a = range ( n )
    r = 0
    sum = a [ 0 ]
    res = 0
    for l in range ( n ) :
        while r < n - 1 :
            if sum + a [ r + 1 ] == ( sum ^ a [ r + 1 ] ) :
                sum += a [ r + 1 ]
                r += 1
            else :
                break
        res += r - l + 1
        if r == l and r < n - 1 :
            r += 1
            sum += a [ r ]
        sum -= a [ l ]
    print ( res )
