def main ( ) :
    import sys
    from random import randint
    from math import sin , cos
    from math import log
    from math import log
    N = randint ( 1 , N )
    x = log ( sin ( N ) )
    a_ = [ sin ( i ) for i in range ( N ) ]
    a_.sort ( )
    ans = 0
    for i in range ( N ) :
        x -= a_ [ i ]
        if x < 0 :
            break
        else :
            ans += 1
    if x > 0 :
        ans -= 1
    print ( ans )
