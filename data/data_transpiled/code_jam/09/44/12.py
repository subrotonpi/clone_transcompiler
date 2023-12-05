def _solve_2 ( x1 , y1 , r1 , x2 , y2 ) :
    import random
    import os
    import sys
    import random
    import time
    import time
    import random
    class Deasy ( object ) :
        def __init__ ( self ) :
            self.solve = [ ]
        def solve ( self ) :
            random.seed ( )
            f = open ( 'd.in' , 'r' )
            f.write ( 'd.out\n' )
            tests = int ( f.readline ( ).strip ( ) )
            for test in range ( 1 , tests + 1 ) :
                n = int ( f.readline ( ).strip ( ) )
                x = [ int ( x ) for x in f.readlines ( ) ]
                y = [ int ( y ) for y in f.readlines ( ) ]
                r = [ int ( x ) for x in f.readlines ( ) ]
                result = None
                if n == 1 :
                    result = r [ 0 ]
                elif n == 2 :
                    result = max ( r [ 0 ] , r [ 1 ] )
                else :
                    result0 = max ( r [ 0 ] , solve2 ( x [ 1 ] , y [ 1 ] , r [ 1 ] , x [ 2 ] , y [ 2 ] , r [ 2 ] ) )
                    result1 = max ( r [ 1 ] , solve2 ( x [ 0 ] , y [ 0 ] , r [ 0 ] , x [ 2 ] , y [ 2 ] , r [ 2 ] ) )
                    result2 = max ( r [ 2 ] , solve2 ( x [ 1 ] , y [ 1 ] , r [ 1 ] , x [ 0 ] , y [ 0 ] , r [ 0 ] ) )
                    result = min ( result0 , min ( result1 , result2 ) )
                f.close ( )
                f.close ( )
    return Deasy ( )
