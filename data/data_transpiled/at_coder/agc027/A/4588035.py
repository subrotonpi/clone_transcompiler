def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin
    from math import log
    from math import log
    from math import log
    from math import log
    N = randint ( 1 , N )
    x = log ( N )
    cnt = 0
    nums = [ ]
    sum = 0
    for i in range ( N ) :
        nums.append ( log ( i ) )
        sum += nums [ i ]
    nums.sort ( )
    if x > sum :
        print ( N - 1 )
    elif x == sum :
        print ( N )
    else :
        for i in range ( N ) :
            if nums [ i ] <= x :
                x = x - nums [ i ]
                cnt += 1
        print ( cnt )
