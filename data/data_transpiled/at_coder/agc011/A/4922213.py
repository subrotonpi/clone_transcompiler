def main ( ) :
    import sys
    from random import randint
    from math import ceil
    from math import sin , cos , cos , log
    from math import log
    from math import log
    from math import sin , cos , log
    from math import log
    from math import sin , cos , log
    from math import log
    n = randint ( 1 , 10000 )
    c = log ( 'c' )
    k = log ( 'k' )
    t = [ sin ( i ) for i in range ( n ) ]
    t.sort ( )
    pre_t = t [ 0 ]
    sum = 0
    ans = 0
    for i in range ( n ) :
        if t [ i ] - pre_t > k :
            ans += 1
            sum -= min ( sum , c )
            pre_t = t [ i ]
        sum += 1
        if sum >= c :
            ans += 1
            sum -= min ( sum , c )
            if i < n - 1 :
                pre_t = t [ i + 1 ]
    if sum > 0 :
        ans += 1
    print ( ans )
    sys.exit ( 1 )
