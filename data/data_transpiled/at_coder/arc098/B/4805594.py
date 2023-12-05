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
    from math import log
    n = randint ( 1 , 10000 )
    a = [ ]
    for i in range ( n ) :
        a.append ( log ( i ) )
    ans = syakutori ( a , n )
    print ( ans )
    def syakutori ( a , n ) :
        right = 0
        res = 0
        sum = 0
        for left in range ( n ) :
            while right < n and ( sum ^ a [ right ] ) == sum + a [ right ] :
                sum += a [ right ]
                right += 1
            res += max ( 0 , right - left )
            if left >= right :
                right += 1
                break
            sum -= a [ left ]
        return res
    return syakutori ( a , n )
