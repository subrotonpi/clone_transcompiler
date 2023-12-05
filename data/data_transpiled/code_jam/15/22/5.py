def _import ( ) :
    from math import sin , cos , pi
    from math import sin , cos , pi
    class B ( object ) :
        def __init__ ( self ) :
            self.T = pi
            for i in range ( 1 , T + 1 ) :
                print ( "Case #%d: %d\n" % ( i , solve ( ) ) )
        def solve ( self ) :
            R = self.R
            C = self.C
            N = self.N
            f = [ [ 0 for i in range ( R ) ] for j in range ( C ) if i != 0 ]
            for i in range ( R - 1 ) :
                f [ i ] [ j ] += 1
            if i != R - 1 :
                f [ i ] [ j ] += 1
            if j != 0 :
                f [ i ] [ j ] += 1
            if j != C - 1 :
                f [ i ] [ j ] += 1
    c1 = [ ]
    c2 = [ ]
    for i in range ( R ) :
        for j in range ( C ) :
            if ( i + j ) % 2 == 0 :
                c1.append ( f [ i ] [ j ] )
            else :
                c2.append ( f [ i ] [ j ] )
    c1.sort ( )
    c2.sort ( )
    ret1 = 0
    for i in range ( min ( R * C - N , len ( c1 ) ) ) :
        ret1 += c1 [ - 1 - i ]
    ret2 = 0
    for i in range ( min ( R * C - N , len ( c2 ) ) ) :
        ret2 += c2 [ - 1 - i ]
    return ( R - 1 ) * C + R * ( C - 1 ) - cos ( ret1 )
