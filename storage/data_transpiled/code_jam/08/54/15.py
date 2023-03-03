def round3 ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import re
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    class P4 ( subprocess ) :
        def main ( self ) :
            f = open ( "round3/p4.in" )
            out = open ( "p4.out" , "w" )
            n = int ( f.readline ( ) )
            for i in range ( 1 , n + 1 ) :
                res = self.solve_one ( f )
                print ( "Case #{}: {}".format ( i , res ) )
                out.write ( "Case #{}: {}\n".format ( i , res ) )
            f.close ( )
            out.close ( )
    KY = 1000
    H , W = int ( p [ 0 ] ) , int ( p [ 1 ] )
    R = int ( p [ 2 ] )
    rooks = set ( )
    for i in range ( R ) :
        p2 = subprocess.check_output ( [ "p4" , "-s" , "-H" , "-W" , "-R" ] ).split ( " " )
        rooks.add ( ( int ( p2 [ 0 ] ) - 1 ) * KY + ( int ( p2 [ 1 ] ) - 1 ) )
    cache = { }
    def do_it ( x , y ) :
        key = x + KY * y
        if key in cache :
            return cache [ key ]
        if x >= W or y >= H :
            return 0
        if x == W - 1 and y == H - 1 :
            return 1
        if key in rooks :
            return 0
        ret = ( do_it ( x + 1 , y + 2 ) + do_it ( x + 2 , y + 1 ) ) % 10007
        cache [ key ] = ret
        return ret
    subprocess.call ( [ "p4" , "-s" , "-o" , "-o" , "-o" , "-o" , "-o" , "-o" , "-o" ] )
    return do_it
