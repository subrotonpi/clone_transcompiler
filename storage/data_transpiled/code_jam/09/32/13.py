def __py_main ( eleusive_loves_men ) :
    import math
    import os
    import os
    import sys
    class p2 ( object ) :
        def __init__ ( self , eleusive_loves_men ) :
            self.f = open ( 'B-small.in' , 'r' )
            self.f = open ( 'B-small.out' , 'w' )
            sa = self.f.readline ( ).strip ( 's+' ).split ( '+' )
            KK = int ( sa [ 0 ] )
            for qq in range ( 1 , KK + 1 ) :
                sa = self.f.readline ( ).strip ( 's+' ).split ( '+' )
                nflies = int ( sa [ 0 ] )
                x0 , y0 , z0 , dx , dy , dz = 0 , 0 , 0 , 0 , 0
                for i in range ( nflies ) :
                    sa = self.f.readline ( ).strip ( 's+' ).split ( '+' )
                    x0 += float ( sa [ 0 ] )
                    y0 += float ( sa [ 1 ] )
                    z0 += float ( sa [ 2 ] )
                    dx += float ( sa [ 3 ] )
                    dy += float ( sa [ 4 ] )
                    dz += float ( sa [ 5 ] )
                x0 /= nflies
                y0 /= nflies
                z0 /= nflies
                dx /= nflies
                dy /= nflies
                dz /= nflies
                if qq == 5 :
                    print ( '-b/2=%d' % ( - ( x0 * dx + y0 * dy + z0 * dz ) ) )
                    print ( 'a=%d' % ( dx * dx + dy * dy + dz * dz ) )
                tmin = - ( x0 * dx + y0 * dy + z0 * dz ) / ( dx * dx + dy * dy + dz * dz )
                if tmin < 0.0 : tmin = 0.0
                if tmin != tmin : tmin = 0.0
                dmin = math.sqrt ( ( x0 + dx * tmin ) ** 2 + ( y0 + dy * tmin ) ** 2 + ( z0 + dz * tmin ) ** 2 )
                print ( 'Case #%d: %d %d' % ( qq , dmin , tmin ) )
