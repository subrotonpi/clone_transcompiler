def import import struct
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        s = self.s
        l = [ ]
        r = [ ]
        for i in range ( n ) :
            l.append ( s [ i ] )
            r.append ( s [ 2 * n - 1 - i ] )
        buf = [ ]
        count = 0
        for i in range ( ( 1 << n ) ) :
            p = struct.unpack ( '>L' , s [ i ] )
            for j in range ( n ) :
                k = ( i >> j ) & 1
                buf.append ( [ k , p [ k ] ] )
                p [ k ] += 1
            dp = [ [ 1 ] * ( p [ 0 ] + 1 ) for x in range ( p [ 1 ] + 1 ) ]
            dp [ 0 ] [ 0 ] = 1
            for x in range ( 0 , p [ 0 ] ) :
                for y in range ( 0 , p [ 1 ] ) :
                    if x < p [ 0 ] and r [ x + y ] == buf [ 0 ] [ x ] :
                        dp [ x + 1 ] [ y ] += dp [ x ] [ y ]
                    if y < p [ 1 ] and r [ x + y ] == buf [ 1 ] [ y ] :
                        dp [ x ] [ y + 1 ] += dp [ x ] [ y ]
            count += dp [ p [ 0 ] ] [ p [ 1 ] ]
        print ( count )
