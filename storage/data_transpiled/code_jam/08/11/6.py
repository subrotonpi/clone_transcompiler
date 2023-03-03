def round1 ( ) :
    import os
    import sys
    import math
    import os
    import sys
    import math
    import os
    import sys
    sys.stdout = open ( 'A-large.in' , 'r' )
    sys.stdout = open ( 'A-large-out' , 'w' )
    T = int ( sys.stdin.readline ( ) )
    for i in range ( 1 , T + 1 ) :
        n = int ( sys.stdin.readline ( ) )
        V1 = sys.stdin.readline ( ).split ( )
        V2 = sys.stdin.readline ( ).split ( )
        v1 , v2 = [ int ( x ) for x in V1 ] , [ int ( x ) for x in V2 ]
        v1 = [ int ( x ) for x in v1 ]
        v2 = [ int ( x ) for x in v2 ]
        res = 0
        for j in range ( n ) :
            res += v1 [ j ] * v2 [ n - 1 - j ]
        sys.stdout.write ( 'Case #%d: %d\n' % ( i , res ) )
    sys.stdout.flush ( )
