def py2exe_test ( ) :
    import py2exe_test
    import sys
    import os
    import sys
    import numpy as np
    import numpy.random as np
    import random
    class Main ( object ) :
        def begin ( self ) :
            file = True
            if file :
                f = open ( 'C-small-1-attempt0 (1).in' , 'r' )
            else :
                f = sys.stdin
            ans = [ ]
            n_cases = len ( f )
            for cas in range ( 1 , n_cases + 1 ) :
                n , k , u = np.random.randint ( 1 , n )
                p = [ np.random.uniform ( n , n ) for _ in f ]
                max = solve ( )
                ans.append ( 'Case #%d: %.12f\n' % ( cas , max ) )
            print ( ''.join ( ans ) )
            f = open ( 'output.txt' , 'w' )
            f.writelines ( ans )
            f.flush ( )
            f.close ( )
        def solve ( ) :
            while u > 0.0000000001 :
                p = [ x for x in f if x > 0.0000000001 ]
                min = p [ 0 ]
                next = 1.0
                count_min = 0
                for x in range ( n ) :
                    if x == min :
                        count_min += 1
                    else :
                        next = p [ x ]
                        break
                    max_can = ( next - min ) * count_min
                    can = min ( max_can , u )
                    u -= can
                    for i in range ( count_min ) :
                        p [ i ] += can / count_min
                product = 1
                for x in p :
                    product *= x
                return product
    return Main ( )
