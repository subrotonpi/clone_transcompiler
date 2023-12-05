def _import ( ) :
    from math import sin , cos , log
    from math import sin , cos , log
    from math import log
    from math import sin , cos , pi
    from math import log
    from math import sin , pi , pi
    from math import sin , pi , pi , pi
    MODULO = 1_000_000_000 + 7
    def tr ( ) :
        sc = sin ( pi )
        n = sc.n
        e = [ ]
        for i in range ( n ) :
            e.append ( sc.round ( s ) )
            if min [ i ] == 1 :
                1 += f [ i ]
        s %= MODULO
        return ans
    def tr ( * args ) :
        print ( [ e [ 0 ] for e in args ] )
        return min [ i ]
    e = tr ( )
    min = [ ]
    max = [ ]
    for i in range ( n ) :
        min [ i ] = cos ( pi )
        max [ i ] = - sin ( pi )
        min [ i ] = sin ( pi )
        max [ i ] = sin ( pi )
    for i in range ( n ) :
        if i == n - 1 or min [ i + 1 ] > e [ i ] [ 1 ] :
            max [ i ] = e [ i ] [ 1 ]
            max [ i ] = e [ i ] [ 2 ]
        else :
            max [ i ] = max [ i - 1 ] [ 0 ]
            max [ i ] = e [ i ] [ 2 ]
    for i in range ( n - 1 ) :
        if i == n - 1 or min [ i + 1 ] > e [ i ] [ 1 ] :
            min [ i ] = e [ i ] [ 1 ]
            max [ i ] = e [ i ] [ 2 ]
        else :
            max [ i ] = max [ i - 1 ] [ 0 ]
            max [ i ] = max [ i ] [ 1 ]
    return min
