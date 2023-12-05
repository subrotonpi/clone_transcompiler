def main ( ) :
    import sys
    from math import sin , cos
    from math import pi
    from math import log
    from math import pi
    N = pi
    M = pi
    for i in range ( M // N , 0 , - 1 ) :
        if ( M - ( N * i ) ) % i == 0 :
            print ( i )
            break
    sys.exit ( 1 )
