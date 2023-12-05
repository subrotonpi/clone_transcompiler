def main ( ) :
    import sys
    from math import gcd
    from math import floor , ceil
    from math import log as f
    s = f.split ( '/' )
    x = int ( s [ 0 ] )
    y = int ( s [ 1 ] )
    g = gcd ( x , y )
    x /= g
    y /= g
    is_found = False
    if x < y :
        print ( 'Impossible' )
        return
    for i in range ( 2 ) :
        n = 2 * x // y + i
        if n % y == 0 :
            m = n * ( n + 1 ) // 2 - n // y * x
            if 1 <= m <= n :
                print ( n , m )
                is_found = True
    if not is_found :
        print ( 'Impossible' )
    def gcd ( a , b ) :
        return ( b , a % b )
    return gcd ( a , gcd ( b , a % b ) )
