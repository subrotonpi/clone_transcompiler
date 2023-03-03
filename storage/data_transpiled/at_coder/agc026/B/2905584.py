def _import ( ) :
    from math import gcd
    if not b :
        return a
    return gcd ( b , a % b )
def check ( a , b , c , d ) :
    if a < b or d < b :
        return False
    if c + 1 >= b :
        return True
    g = gcd ( b , d )
    return ( a - c - 1 ) / g - ( a - b ) / g <= 0
