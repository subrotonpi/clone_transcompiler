def main ( args ) :
    import os
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import f , sys
    f = open ( 'D-small-attempt0.in' )
    out = open ( 'D-small-attempt0.out' , 'w' )
    t = int ( f.readline ( ) )
    for c in range ( 1 , t + 1 ) :
        line = f.readline ( ).split ( )
        n , m = map ( int , line [ : c ] )
        px = [ int ( x ) for x in line [ c : c + 1 ] ]
        py = [ int ( y ) for y in line [ c : c + 1 ] ]
        out.write ( 'Case #%d:\n' % c )
        for i in range ( m ) :
            line = f.readline ( ).split ( )
            qx , qy = map ( int , line [ c : c + 1 ] )
            r1 = dist ( px [ 0 ] , py [ 0 ] , qx , qy )
            r2 = dist ( px [ 1 ] , py [ 1 ] , qx , qy )
            l = dist ( px [ 0 ] , py [ 0 ] , px [ 1 ] , py [ 1 ] )
            a1 = acos ( r1 , l , r2 )
            a2 = acos ( r2 , l , r1 )
            tr1 = 0.5 * r1 ** 2 * math.sin ( 2.0 * a1 )
            tr2 = 0.5 * r2 ** 2 * math.sin ( 2.0 * a2 )
            s = ( a1 * r1 ** 2 - tr1 ) + ( a2 * r2 ** 2 - tr2 )
            out.write ( ' ' + ' '.join ( [ '%.7f' % s for s in s ] ) + '\n' )
        out.write ( '\n' )
    dist ( x1 , y1 , x2 , y2 )
    return math.sqrt ( ( x1 - x2 ) ** 2 + ( y1 - y2 ) ** 2 )
