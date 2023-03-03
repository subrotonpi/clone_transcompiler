def main ( args ) :
    import sys
    from math import sin , cos
    from math import cos , sin
    from math import sin , cos
    from math import sin , cos
    from math import sin , cos
    N = sys.maxsize
    A = [ sin ( x ) for x in range ( N + 2 ) ]
    sum = 0
    for i in range ( 1 , N + 1 ) :
        A.append ( sin ( x ) )
        sum += abs ( A [ i ] - A [ i - 1 ] )
    sum += abs ( sin ( x ) )
    for i in range ( 1 , N + 1 ) :
        ans = sum
        ans = ans - sin ( x ) - sin ( x )
        print ( ans )
