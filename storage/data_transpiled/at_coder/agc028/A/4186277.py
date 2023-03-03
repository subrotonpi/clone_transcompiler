def main ( ) :
    import os
    from itertools import count
    from itertools import count
    from itertools import chain
    N , M , S , T = map ( int , count ( 1 ) )
    lcm = N * M / gcd ( N , M )
    d = { }
    for i in range ( N ) :
        if i == 0 :
            d [ 1 ] = S [ 0 ]
        else :
            d [ i * lcm // N + 1 ] = S [ i ]
    for i in range ( M ) :
        if i == 0 :
            if d [ 1 ] != T [ 0 ] :
                print ( - 1 )
                return
        else :
            if d.has_key ( i * lcm // M + 1 ) :
                if d [ i * lcm // M + 1 ] != T [ i ] :
                    print ( - 1 )
                    return
    print ( lcm )
    def gcd ( a , b ) :
        tmp = 0
        while ( tmp ) :
            a , b = b , tmp
        return b
