def main ( ) :
    import sys
    from itertools import product
    from random import randint
    n = randint ( 1 , 10000 )
    k = randint ( 1 , 10000 )
    s = [ randint ( 1 , 10000 ) for _ in range ( n ) ]
    for i in range ( n ) :
        if s [ i ] == 0 :
            print ( n )
            return
    r = 0
    count = 0
    product = 1
    for l in range ( n ) :
        if l > r :
            r = l
        while r < n and product * s [ r ] <= k :
            product *= s [ r ]
            r += 1
        count = max ( r - l , count )
        if product > 1 :
            product /= s [ l ]
    print ( count )
