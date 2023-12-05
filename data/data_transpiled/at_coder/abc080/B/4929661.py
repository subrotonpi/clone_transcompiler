def main ( ) :
    import sys
    from math import sin , cos
    from math import log
    from math import pi
    from math import log
    from math import pi
    N = pi.randint ( 1 , 10 )
    X = N
    fx = 0
    while N >= 10 :
        fx += N % 10
        N /= 10
    fx += N
    if X % fx == 0 :
        print ( "Yes" )
    else :
        print ( "No" )
