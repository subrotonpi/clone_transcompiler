def gcj ( ) :
    import os
    import sys
    import numpy as np
    import numpy as np
    import os
    import os
    import os
    import sys
    PROBLEM_NAME = 'scipy'
    WORK_DIR = r' D : \ Gcj\ \{ } \ \'.format ( PROBLEM_NAME )
    def preprocess ( ) :
        pass
    def solve ( sc , f ) :
        N = np.shape ( sc ) [ 0 ]
        dist = np.array ( [ np.min ( dist ) for dist in range ( N ) ] )
        len = np.shape ( sc ) [ 0 ]
        D = np.sum ( np.abs ( dist ) )
        max_h = np.empty ( N )
        max_h [ 0 ] = dist [ 0 ]
        for i in range ( N ) :
            if max_h [ i ] == - 1 :
                continue
            if D - dist [ i ] <= max_h [ i ] :
                f.write ( 'YES\n' )
                return
            for j in range ( i + 1 , N ) :
                if dist [ j ] - dist [ i ] <= max_h [ i ] :
                    max_h [ j ] = max ( max_h [ j ] , min ( len [ j ] , dist [ j ] - dist [ i ] ) )
            f.write ( 'NO\n' )
        return
    preprocess ( )
    with open ( WORK_DIR + 'input.txt' , 'r' ) as sc :
        with open ( WORK_DIR + 'output.txt' , 'w' ) as f :
            case_cnt = np.shape ( sc ) [ 0 ]
            for case_num in range ( case_cnt ) :
                print ( 'Processing test case {}'.format ( case_num + 1 ) )
                f.write ( 'Case #{}: '.format ( case_num + 1 ) )
                np.savetxt ( f , case_cnt )
            f.flush ( )
            f.close ( )
            sc.close ( )
