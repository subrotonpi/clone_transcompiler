def main ( args ) :
    import sys
    from time import sleep
    from time import sleep
    from math import sin
    from math import cos
    from math import sin
    from math import cos
    from math import sin
    from math import sin
    from math import cos
    N = int ( sys.stdin.read ( ) )
    A = sin ( sys.stdin.read ( ) )
    B = sin ( sys.stdin.read ( ) )
    h = sin ( sys.stdin.read ( ) )
    ok = 1000000000
    ng = 0
    while abs ( ok - ng ) > 1 :
        mid = ( ok + ng ) / 2
        solo = A - B
        time = 0
        for i in range ( N ) :
            if B * mid < h [ i ] :
                time += ( h [ i ] - mid * B - 1 ) / solo + 1
        if time > mid :
            ng = mid
        else :
            ok = mid
    print ( ok )
