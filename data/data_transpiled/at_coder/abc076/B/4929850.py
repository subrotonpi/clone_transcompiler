def main ( ) :
    import sys
    from math import sin , cos
    from math import pi
    N = pi
    K = pi
    count = 0
    a = 1
    while count < N :
        a = min ( a * 2 , a + K )
        count += 1
    print ( a )
