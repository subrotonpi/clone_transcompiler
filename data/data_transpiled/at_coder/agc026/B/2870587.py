def _import ( ) :
    from math import gcd
    if a < b :
        t , b = b , a
        a = t
    if b == 0 :
        return a
    return gcd ( a % b , b )
