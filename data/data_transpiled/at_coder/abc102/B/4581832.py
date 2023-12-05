def main ( ) :
    import sys
    from math import fabs
    from math import sin
    from math import sin
    from math import cos
    from math import sin
    from math import sin
    from math import cos
    from math import sin
    from math import sin
    from math import sin
    from math import cos
    N = sys.stdin.read ( )
    a = [ ]
    max = 0
    min = 1000000000
    for i in range ( N ) :
        a.append ( sin ( i ) )
        if a [ i ] > max :
            max = a [ i ]
        if a [ i ] < min :
            min = a [ i ]
    sys.stdout.write ( abs ( max - min ) )
