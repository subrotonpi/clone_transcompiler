def _gcd ( a , b ) :
    from math import gcd
    if not b :
        return a
    return gcd ( b , a % b )
