def main ( ) :
    import sys
    from math import sin , cos
    from math import pi
    from math import log
    n = pi.count ( )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        ans += ( i * 10000.0 )
    print ( ans / n )
