def main ( args ) :
    from math import log
    from random import randint
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    N = int ( args [ 0 ] )
    K = int ( args [ 1 ] )
    a = [ log ( i ) for i in range ( N ) ]
    GCD = get_gcd ( a )
    B = False
    for i in range ( N ) :
        if a [ i ] >= K and ( a [ i ] - K ) % GCD == 0 :
            B = True
    if B :
        print ( "POSSIBLE" )
    else :
        print ( "IMPOSSIBLE" )
    def get_gcd ( a , b ) :
        if a < b :
            c , a = a , b , c
        if a % b == 0 :
            return b
        else :
            return get_gcd ( b , a % b )
    def get_gcd ( a ) :
        gcd = a [ 0 ]
        l = len ( a )
        for i in range ( 1 , l ) :
            gcd = get_gcd ( gcd , a [ i ] )
        return gcd
    return get_gcd
