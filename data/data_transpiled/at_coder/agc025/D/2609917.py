def _main ( v ) : return v
import sys
import os
import math
class Main ( object ) :
    def __init__ ( self , v ) :
        self.N = int ( self.sqrt ( v ) )
        self.D1 = self.s
        self.D2 = self.e
        f1 = solve ( self.D1 )
        f2 = solve ( self.D2 )
        f = sys.stdout.write
        c = 0
        for i in range ( 2 * N ) :
            for j in range ( 2 * N ) :
                if f1 [ i ] [ j ] == 1 and f2 [ i ] [ j ] == 1 :
                    c += 1
                    f.write ( "%d %d\n" % ( i , j ) )
        f.flush ( )
    def solve ( d ) :
        pairs = [ ]
        for i in range ( 0 , d ) :
            if isSq ( d - i * i ) :
                j = int ( math.sqrt ( d - i * i ) )
                pairs.append ( ( i , j ) )
                pairs.append ( ( i , - j ) )
                pairs.append ( ( - i , j ) )
                pairs.append ( ( - i , - j ) )
        f = [ ]
        for y in range ( 2 * N ) :
            for x in range ( 2 * N ) :
                if f [ y ] [ x ] != 0 : continue
                cur = [ ( y << 16 ) | x ]
                f [ y ] [ x ] = 1
                for i in range ( 0 , len ( cur ) ) :
                    next = [ ]
                    for pos in cur :
                        cy = pos >> 16
                        cx = pos & 0xFFFF
                        for p in pairs :
                            ny = cy + p.s
                            nx = cx + p.e
                            if 0 <= ny < 2 * N and 0 <= nx < 2 * N and f [ ny ] [ nx ] == 0 :
                                next.append ( ( ny << 16 ) | x )
                    f.append ( next )
        return f
