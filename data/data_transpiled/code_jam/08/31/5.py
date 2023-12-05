def a ( ) :
    import os
    import sys
    import numpy as np
    import numpy.linalg as linalg
    class a ( object ) :
        def __init__ ( self ) :
            with open ( 'A-large.in' , 'r' ) as f :
                input = f.readlines ( )
            with open ( 'large.out' , 'w' ) as f :
                f.write ( '' )
    nrtests = int ( sys.argv [ 1 ] )
    for nrt in range ( nrtests ) :
        spl = sys.argv [ 1 ].split ( )
        p , k , l = [ int ( x ) for x in spl ]
        spl = sys.argv [ 2 : ]
        n = len ( spl )
        v = [ int ( x ) for x in spl ]
        v = [ float ( x ) for x in v ]
        v = [ float ( x ) for x in v ]
        ans = 'Impossible'
        if p * k >= l :
            rez = 0
            for pas , poz in zip ( range ( n ) , range ( n - 1 , p ) ) :
                for j in range ( k ) :
                    if poz >= 0 :
                        rez += int ( pas + 1 ) * int ( v [ int ( poz ) ] )
                ans = '%d' % rez
            f.write ( 'Case #%d: %s\n' % ( nrt + 1 , ans ) )
        f.close ( )
