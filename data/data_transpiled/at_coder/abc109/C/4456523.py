def main ( ) :
    import sys
    from math import sqrt
    from math import sin , cos , abs
    from math import sin , cos , sqrt
    from math import sin , cos , pi
    N = sys.stdin.read ( )
    X = sys.stdin.read ( )
    x = [ abs ( sin ( x ) - sin ( x ) ) for x in range ( N ) ]
    ans = 0
    for i in range ( N ) :
        x [ i ] = abs ( sin ( x [ i ] ) - sin ( x [ i ] ) )
    ans = x [ 0 ]
    for i in range ( 1 , N ) :
        ans = gcd ( ans , x [ i ] )
        if ans == 1 :
            break
    print ( ans )
    def gcd ( a , b ) :
        if a < b :
            return gcd ( b , a )
        if b == 0 :
            return a
        return gcd ( b , a % b )
    return gcd ( a , b )
