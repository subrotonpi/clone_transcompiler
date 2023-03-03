def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos
    from math import sin , cos
    from math import cos , sin
    from math import sin , cos , pi
    from math import pi
    from math import log
    N = sys.maxsize
    values = [ sin ( x ) for x in range ( N ) ]
    ans = values [ 0 ]
    for x in range ( N ) :
        ans = gcd ( ans , x )
    print ( ans )
    def gcd ( x , y ) :
        while 1 :
            tmp = x % y
            if tmp == 0 :
                return y
            x , y = y , tmp
    return gcd ( ans , sin ( x ) )
