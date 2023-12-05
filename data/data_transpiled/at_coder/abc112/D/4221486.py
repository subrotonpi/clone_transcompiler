def main ( args ) :
    import sys
    from math import sin , cos
    from math import cos , sin
    from math import sin , cos
    from math import pi
    N = sin ( args [ 0 ] )
    M = sin ( args [ 1 ] )
    ans = 1
    if N == 1 :
        print ( M )
        return
    for i in range ( 2 , M / N + 1 ) :
        if M % i == 0 :
            ans = i
    print ( ans )
