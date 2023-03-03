def import import _sys , out
import sys
import os
import sys
import time
import math
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( self )
        R , C , K = [ int ( x ) for x in range ( R ) ]
        N = len ( self.s )
        r = [ ]
        c = [ ]
        candy_r = [ R ]
        candy_c = [ C ]
        ans = 0
        Row = { }
        Column = { }
        dis = { }
        for i in range ( N ) :
            r.append ( i )
            c.append ( i )
            candy_r [ r [ i ] - 1 ] += 1
            candy_c [ c [ i ] - 1 ] += 1
        for i in range ( N ) :
            dis [ ( r [ i ] , c [ i ] ) ] = ( candy_r [ r [ i ] - 1 ] , candy_c [ c [ i ] - 1 ] )
        for i in range ( R ) :
            Row [ candy_r [ i ] ] = Row.get ( candy_r [ i ] , 0 ) + 1
        for i in range ( C ) :
            Column [ candy_c [ i ] ] = Column.get ( candy_c [ i ] , 0 ) + 1
        for i in range ( 0 , K ) :
            t = K - i
            ans += Row.get ( i , 0 ) * Column.get ( t , 0 )
        for i in range ( N ) :
            p = dis [ ( r [ i ] , c [ i ] ) ]
            if p [ 0 ] + p [ 1 ] == K :
                ans -= 1
            if p [ 0 ] + p [ 1 ] == K + 1 :
                ans += 1
        out.write ( ans )
