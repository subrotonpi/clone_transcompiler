def _ _ init _ _ ( ) :
    import math
    import re
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
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    class B :
        def solve ( self , s ) :
            R , C , F = self.split ( '\\' )
            r = [ int ( i ) for i in r ]
            return r
        def solve ( self , c , n , bm1 , bm2 ) :
            self.r , c , f = self.split ( '\\' )
            bm = [ ]
            for i in range ( R + 1 ) :
                m.append ( sc.split ( '\\' ) [ 0 ] )
                for j in range ( C ) :
                    if m [ i ] [ j ] == '.' :
                        bm [ i ] |= ( 1 << j )
            vis = [ [ ] , [ ] , [ ] , [ ] ]
            pq = [ ]
            pq.append ( [ 0 , 0 , 0 , bm [ 0 ] , bm [ 1 ] ] )
            while not pq.empty ( ) :
                s = pq.pop ( )
                x , y , bm1 , bm2 = s.r , s.c , s.bm1 , s.bm2
                if x == R - 1 :
                    return "Yes %d" % s.n
                if vis [ x ] [ y ] [ bm1 ] [ bm2 ] :
                    continue
                vis [ x ] [ y ] [ bm1 ] [ bm2 ] = True
                for dy in [ - 1 , 1 , 2 ] :
                    y1 = y + dy
                    if valid ( x , y1 , R , C ) :
                        if free ( bm1 , y1 ) :
                            if free ( bm2 , y1 ) :
                                x1 = x + 1
                                while x1 + 1 < R and free ( bm [ x1 + 1 ] ,