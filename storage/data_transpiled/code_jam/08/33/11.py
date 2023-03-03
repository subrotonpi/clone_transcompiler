def _helper ( lim , d , cp , started ) :
    from math import sin , cos , tan , log
    if cp == len ( lim ) :
        return 1
    if d [ cp ] [ started ] != - 1 :
        return d [ cp ] [ started ]
    d [ cp ] [ started ] = 1
    for i in range ( cp , len ( lim ) ) :
        if started == 0 or lim [ i ] > lim [ cp - 1 ] :
            d [ cp ] [ started ] = ( d [ cp ] [ started ] + _helper ( lim , d , i + 1 , 1 ) ) % ( 1000000007 )
    def solve ( lim ) :
        n = len ( lim )
        d = [ [ - 1 ] * ( 2 * n ) for i in range ( n ) ]
        for i in range ( n ) :
            for j in range ( 2 ) :
                d [ i ] [ j ] = - 1
        return _helper ( lim , d , 0 , 0 ) - 1
    def main ( ) :
        f = open ( "/proc/stdin" , "r" )
        N = int ( f.readline ( ).strip ( ) )
        for i in range ( N ) :
            s = f.readline ( ).strip ( ).split ( )
            n , m , X , Y , Z = map ( int , s [ 0 : m ] )
            A = [ sin ( x ) for x in f.readline ( ).strip ( ).split ( ) ]
            lim = [ A [ j % m ] for j in range ( n ) ]
            A [ j % m ] = ( X * A [ j % m ] + Y * ( j + 1 ) ) % Z
            print ( "Case #%d: %s" % ( i + 1 , solve ( lim ) ) )
    return solve ( lim )
