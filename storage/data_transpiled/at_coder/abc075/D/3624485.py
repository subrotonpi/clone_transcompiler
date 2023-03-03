def main ( args ) :
    from random import randint
    from math import sqrt
    from math import sin , cos , cos , log
    from os import urandom
    N = randint ( 1 , 10000 )
    K = randint ( 1 , 10000 )
    x = [ random.randint ( 0 , N ) for _ in range ( N ) ]
    y = [ random.randint ( 0 , N ) for _ in range ( N ) ]
    ans = 2000000000
    ans *= sqrt ( ans )
    for x1 in x :
        for x2 in x :
            for k in y :
                y1 = y [ k ]
                for l in y :
                    y2 = y [ l ]
                    if x1 < x2 and y1 < y2 :
                        num = 0
                        for m in range ( N ) :
                            if x1 <= x [ m ] <= x2 and y1 <= y [ m ] <= y2 :
                                num += 1
                            if num >= K :
                                ans = min ( ans , ( x2 - x1 ) * ( y2 - y1 ) )
    print ( ans )
