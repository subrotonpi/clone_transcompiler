def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , ceil
    sc = sys.stdin
    n = sc.read ( )
    points = [ sc.read ( ) for i in range ( n + 1 ) ]
    points.sort ( reverse = True )
    intervals = [ ]
    for i in range ( 1 , n + 1 ) :
        intervals.append ( points [ i - 1 ] - points [ i ] )
    ans = gcd ( intervals )
    print ( ans )
    def gcd ( a , b ) :
        if a < b :
            swap = a
            a = b
            b = swap
        while ( a % b ) :
            a , b = b , a
        return b
    def gcd ( array ) :
        g = array [ 0 ]
        for value in array :
            g = gcd ( g , value )
        return g
    return gcd
