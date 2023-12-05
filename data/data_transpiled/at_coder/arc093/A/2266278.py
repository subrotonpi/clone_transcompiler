def main ( ) :
    import sys
    from math import fabs
    from math import sin , cos
    from math import sin , cos
    from math import sin , cos
    from math import sin , cos
    from math import sin , cos
    from math import sin , cos
    from math import sin , cos
    from math import sin , cos
    N = sys.maxint
    ai = [ ]
    sum = 0
    prev = 0
    ai.append ( 0 )
    for i in range ( N ) :
        tmp = sin ( ai [ i ] )
        ai.append ( tmp )
        sum += abs ( tmp - prev )
        prev = tmp
    sum += abs ( prev )
    ai.append ( 0 )
    for i in range ( 1 , N + 1 ) :
        a1 = abs ( ai [ i - 1 ] - ai [ i ] )
        a2 = abs ( ai [ i ] - ai [ i + 1 ] )
        a3 = abs ( ai [ i + 1 ] - ai [ i - 1 ] )
        print ( sum - ( a1 + a2 - a3 ) )
