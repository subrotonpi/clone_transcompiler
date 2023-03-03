def main ( ) :
    import sys
    import os
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.T = len ( sys.stdin )
    for i in range ( T ) :
        ans = 0
        N = len ( sys.stdin )
        W = [ [ ] for _ in range ( N ) ]
        for j in range ( len ( W ) ) :
            for j2 in range ( j ) :
                if ( ( W [ j ] [ 0 ] > W [ j2 ] [ 0 ] ) and ( W [ j ] [ 1 ] < W [ j2 ] [ 1 ] ) ) or ( ( W [ j ] [ 0 ] < W [ j2 ] [ 0 ] ) and ( W [ j ] [ 1 ] > W [ j2 ] [ 1 ] ) ) :
                    ans += 1
        sys.stdout.write ( "Case #%d: %d\n" % ( i + 1 , ans ) )
