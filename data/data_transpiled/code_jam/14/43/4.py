def contest ( ) :
    import os
    import numpy as np
    import numpy.random
    import numpy.random
    class DontBreakTheNile :
        PROBLEM_NAME = "nile"
        WORK_DIR = r"D:\GCJ\\"+PROBLEM_NAME+" \ \"
        class Rectangle :
            x1 , y1 , x2 , y2 = [ ] , [ ] , [ ] , [ ]
            def __init__ ( self , sc ) :
                self.x1 , self.y1 , self.x2 , self.y2 = [ ] , [ ] , [ ]
            def __call__ ( self , d ) :
                self.x1 = self.x1 - d
                self.x2 = self.x2 + d
                self.y1 = self.y1 - d
                self.y2 = self.y2 + d
            def intersect ( self , a , b ) :
                return max ( self.x1 , b.x1 ) <= min ( self.x2 , b.x2 ) and max ( self.y1 , b.y1 ) <= min ( self.y2 , b.y2 )
            def dist ( self , a , b ) :
                L , R = 0 , 200000000
                while R - L > 1 :
                    mid = ( L + R ) // 2
                    if intersect ( [ a , mid ] , b ) :
                        R = mid
                    else :
                        L = mid
                return L
            def solve ( self , sc , f ) :
                W , H , B = [ ] , [ ] , [ ] , [ ]
                for i in range ( B ) :
                    r.append ( [ ] )
                dist = [ [ ] for _ in range ( B + 2 ) ]
                for j in range ( i + 1 ) :
                    dist [ 0 ].append ( dist [ j + 1 ] [ i + 1 ] )
                    dist [ j + 1 ].append ( W - r [ j ] [ i ] [ j ] )
                dist [ 0 ].append ( dist [ j + 1 ] [ 0 ] )
                dist [ j + 1 ].append ( dist [ j + 1 ] [ i + 1 ] )
            return dist
    return DontBreakTheNile ( )
