def _import ( ) :
    import math
    import os
    import os
    import os
    import math
    import os
    import math
    import os
    import math
    import math
    import os
    import sys
    class B :
        def __init__ ( self ) :
            self.dist = ( a , b )
        def __init__ ( self ) :
            self.dist = ( a , b )
        def __init__ ( self ) :
            self.dist = ( a , b )
        def __init__ ( self ) :
            self.dist = ( a , b )
        def __repr__ ( self ) :
            return ''
    f = open ( 'C.in' , 'w' )
    tc = len ( f.readlines ( ) )
    for cc in range ( 1 , tc + 1 ) :
        n , s = f.readlines ( )
        points = [ [ x [ 0 ] , y [ 1 ] , z [ 2 ] ] for x in range ( n ) ]
        vel = [ [ x [ 0 ] , y [ 1 ] , z [ 2 ] ] for y in range ( n ) ]
        lo = 0
        hi = 100000000
        while hi > lo :
            mid = ( lo + hi ) / 2
            v = [ False ] * n
            q = [ 0 ]
            v [ 0 ] = True
            while not q.empty ( ) :
                node = q.pop ( )
                for j in range ( n ) :
                    if not v [ j ] and _dist ( self.points [ node ] , self.points [ j ] ) <= mid :
                        q.append ( j )
                        v [ j ] = True
            if v [ 1 ] :
                hi = mid
            else :
                lo = mid + 1
        print ( 'Case #%d: %.9f\n' % ( cc , math.sqrt ( hi ) ) )
