def _import ( ) :
    import sys
    import numpy as np
    import numpy as np
    import collections
    import numpy.core as np
    import numpy.core as np
    import numpy.core as np
    import numpy.core as np
    import numpy.core as np
    import numpy.core as np
    import numpy.core as np
    import numpy.core as np
    class A :
        def __init__ ( self , * os ) :
            np.__init__ ( self , * os )
    S , T = 3000 , S * 4 + 1
    map = np.zeros ( ( S * 4 + 1 , S * 4 + 1 ) )
    def run ( ) :
        with open ( '/dev/null' , 'r' ) as f :
            on = f.read ( )
            for o in range ( 1 , on + 1 ) :
                print ( 'Case #%d: ' % o , end = ' ' )
                n = f.read ( )
                for i in range ( S * 4 + 1 ) :
                    fill ( map [ i ] , False )
                x , y , dx , dy = S * 2 , 1 , 0 , S * 2
                for i in range ( n ) :
                    cs = f.read ( )
                    m = f.read ( )
                    for j in range ( m ) :
                        for c in cs :
                            if c == 'L' :
                                tx , ty = dy * - 1 , dx
                                dx , dy = tx , ty
                            elif c == 'R' :
                                tx , ty = dy * 1 , - dx
                                dx , dy = tx , ty
                            else :
                                map [ x , y ] = map [ x + dx , y + dy ] = True
                                x += dx * 2
                                y += dy * 2
    res = 0
    for i in range ( 1 , T + 2 ) :
        last = - 1
        in_in = False
        for j in range ( 1 , T + 2 ) :
            if map [ i ] [ j ] :
                if in_in :
                    in_in = False
                    last = j
                else :
                    in_in = True
                if last < 0 :
                    continue
                for k in range ( last + 1 , j + 2 ) :