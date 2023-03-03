def _main ( ) :
    from os import fdopen
    from os import fdopen
    from os import fdopen
    from os import fdopen
    from os.path import join
    from os import fdopen
    from os.path import join
    from os.path import join
    from os import fdopen
    from os.path import join
    from os.path import join
    from os import close
    from os import close
    from os.path import join
    from os import close
    from os import close
    from os import close
    from os import close
    from os import close
    from os import close
    from os import close
    from os import close
    from os import close
    from time import sleep
    MOD = int ( 1e9 ) + 7
    def solve ( test_number , f , close ) :
        r , c , x , y , d , l = [ int ( x ) for x in range ( 0 , 2 ) ]
        f = d + l
        s = x * y
        nck = [ [ 1 ] * ( s + 1 ) ]
        nck [ 0 ] [ 0 ] = 1
        for n in range ( 1 , s + 1 ) :
            nck [ n ] [ 0 ] = 1
            for k in range ( 1 , n + 1 ) :
                nck [ n ] [ k ] = ( nck [ n - 1 ] [ k - 1 ] + nck [ n - 1 ] [ k ] ) % MOD
        ans = ( r - x + 1 ) * ( c - y + 1 ) * nck [ f ] [ d ] % MOD
        if f == s :
            close ( ans )
            return
        u , nA , nB , nAB , nAC , nBD , nABC = nck [ s ] [ f ]
        return u - ( nA + nB + nA + nB ) + ( nAB + nAB + nAB + nBD ) - ( nABC + nAB + nBC + nAB ) + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB + nAB
    