def main ( ) :
    import math
    from math import degrees
    from math import radians
    from math import radians
    from math import radians
    from math import radians
    from math import radians
    n = radians ( n )
    m = radians ( m )
    a = 360.0 / 60 * m
    b = 360.0 / 12 * ( n % 12 ) + a / 12
    ans = abs ( a - b )
    print ( 360 - ans if ans > 180 else ans )
