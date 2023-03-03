def main ( args ) :
    from math import sqrt
    from random import randint
    from math import log
    from math import log
    from math import log
    N = randint ( 1 , N )
    K = randint ( 1 , K )
    s = [ log ( i ) for i in range ( N ) ]
    if s == 0 :
        print ( N )
        return
    if K == 0 :
        print ( 0 )
        return
    ans = 1
    plus_cnt = 0
    minus_cnt = 0
    max = 0
    res = 0
    while plus_cnt != N :
        ans *= s [ plus_cnt ]
        plus_cnt += 1
        while ans > K :
            ans /= s [ minus_cnt ]
            minus_cnt += 1
        if max <= ans :
            if res < plus_cnt - minus_cnt :
                res = plus_cnt - minus_cnt
    print ( res )
