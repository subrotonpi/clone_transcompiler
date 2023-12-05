def main ( ) :
    import sys
    from random import randint
    from math import pow
    from random import randint
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = randint ( 1 , 200 )
    ans = 200
    a1 = [ ]
    sum = 0
    for i in range ( n ) :
        a = randint ( 1 , 200 )
        sum += a
        a1.append ( a )
    for i in range ( pow ( 2 , n - 1 ) ) :
        t = i
        count = 0
        sum0 = sum
        sum1 = 0
        while t > 0 :
            if t & 1 == 1 :
                sum1 += a1 [ count ]
                sum0 -= a1 [ count ]
            count += 1
            t >>= 1
        if ans > max ( sum0 , sum1 ) :
            ans = max ( sum0 , sum1 )
    print ( ans )
