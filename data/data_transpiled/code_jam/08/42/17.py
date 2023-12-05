def round2 ( ) :
    import os
    import re
    import sys
    import os
    import sys
    class P2 ( object ) :
        def __init__ ( self ) :
            self.f = open ( "round2/p2.in" , "r" )
            self.out = open ( "p2.out" , "w" )
            self.n = int ( self.f.readline ( ) )
            for i in range ( 1 , self.n + 1 ) :
                res = self.solve_one ( self.f )
                print ( "Case #{}: {}".format ( i , res ) )
                self.out.write ( "Case #{}: {}\n".format ( i , res ) )
    def solve_one ( self ) :
        parts = re.split ( "s+" , self.f.readline ( ) )
        N = int ( parts [ 0 ] )
        M = int ( parts [ 1 ] )
        A = int ( parts [ 2 ] )
        if A > N * M :
            return "IMPOSSIBLE"
        for x2 in range ( 0 , N ) :
            for y2 in range ( 0 , M ) :
                for x3 in range ( 0 , N ) :
                    for y3 in range ( 0 , M ) :
                        if A == abs ( x2 * y3 - x3 * y2 ) :
                            return '0 0 %d %d %d %d' % ( x2 , y2 , x3 , y3 )
        return "IMPOSSIBLE"
