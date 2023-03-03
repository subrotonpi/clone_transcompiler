def main ( ) :
    import sys
    from math import gcd
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    N = pi
    M = pi
    S = pi.letters
    T = pi.digits
    g = gcd ( N , M )
    L = ( N * M ) / g
    flag = 1
    for i in range ( g ) :
        if S [ int ( N / g * i ) ] != T [ int ( M / g * i ) ] :
            flag = 0
    if flag :
        print ( L )
    else :
        print ( "-1" )
    sys.exit ( 1 )
