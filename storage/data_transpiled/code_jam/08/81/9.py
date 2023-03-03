def _import ( ) :
    import os
    import numpy as np
    import os
    import os
    import sys
    import os
    import numpy.genmod as genmod
    f = open ( 'A-large.in' , 'r' )
    out = genmod.open ( 'a.out' , 'w' )
    N = int ( f.readline ( ) )
    for i in range ( 1 , N + 1 ) :
        x1 = [ ]
        y1 = [ ]
        tz = [ ]
        for i in range ( 3 ) :
            x1.append ( int ( tz [ i ] ) )
            y1.append ( int ( tz [ i ] ) )
        x2 = [ ]
        y2 = [ ]
        tz = [ ]
        for i in range ( 3 ) :
            x2.append ( int ( tz [ i ] ) )
            y2.append ( int ( tz [ i ] ) )
        dx1 , dy1 = - x1 [ 0 ] , - y1 [ 0 ]
        for i in range ( 3 ) :
            x1 [ i ] += dx1
            y1 [ i ] += dy1
        dx2 , dy2 = - x2 [ 0 ] , - y2 [ 0 ]
        for i in range ( 3 ) :
            x2 [ i ] += dx2
            y2 [ i ] += dy2
        scale = np.hstack ( [ x2 [ 1 : ] , y2 [ 1 : ] ] ) / np.hstack ( [ x1 [ 1 : ] , y1 [ 1 : ] ] )
        for i in range ( 3 ) :
            x2 [ i ] /= scale
            y2 [ i ] /= scale
        dd = x1 [ 1 : ] ** 2 + y1 [ 1 : ] ** 2
        sa , ca , d = ( x1 [ 1 : ] * y2 [ 1 : ] - x2 [ 1 : ] * y1 [ 1 : ] ) / dd , ( x1 [ 1 : ] * x2 [ 1 : ] + y1 [ 1 : ] * y2 [ 1 : ] ) / dd
        a , b , c , d = a * scale , a * scale , a * scale , a * scale , a * scale , a * scale , a * scale , a * scale , a * scale , a * scale , a * scale , a * scale , a * scale , a * scale , a * scale , a * scale , a *