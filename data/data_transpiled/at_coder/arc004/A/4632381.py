def _import ( ) :
    from math import sqrt
    from os import fsencode
    import os
    from os import fsencode
    from os import fsencode
    N = len ( sys.argv )
    x = [ fsencode.find ( 'x' ) for i in range ( 0 , N , 1 ) ]
    y = [ fsencode.find ( 'y' ) for i in range ( 0 , N , 1 ) ]
    max = 0.0
    for i in range ( 0 , N , 1 ) :
        for j in range ( i + 1 , N , 1 ) :
            dx = x [ i ] - x [ j ]
            dy = y [ i ] - y [ j ]
            d = sqrt ( dx ** 2 + dy ** 2 )
            if max < d :
                max = d
    fsencode ( '%.6f' % ( max ) )
