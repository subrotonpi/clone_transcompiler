def main ( ) :
    import sys
    from math import sin , cos
    from math import log
    from math import pi
    n = pi ( )
    m = pi ( )
    d = m - n
    ans = 0
    for i in range ( 1 , d + 1 ) :
        ans += i
    print ( ans - m )
