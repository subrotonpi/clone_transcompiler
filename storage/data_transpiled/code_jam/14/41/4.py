def contest ( ) :
    import os
    import sys
    import numpy
    import os
    import os
    import sys
    import numpy.random
    import numpy.testing as np
    class DataPacking ( object ) :
        PROBLEM_NAME = "dpack"
        WORK_DIR = r"D:\GCJ\\"+PROBLEM_NAME+" \ \"
        def solve ( self , sc , f ) :
            N = sc.randint ( 0 , N )
            X = sc.randint ( 0 , N )
            sz = [ sc.randint ( 0 , N ) for i in range ( N ) ]
            sz.sort ( )
            ans = N
            for t in range ( 0 , 2 * t ) :
                ok = True
                for i , j in zip ( 0 , 2 * t - 1 , 2 * t ) :
                    if sz [ i ] + sz [ j ] > X :
                        ok = False
                if ok :
                    ans = min ( ans , N - t )
            f.write ( ans )
    def main ( ) :
        with open ( os.path.join ( WORK_DIR , "input.txt" ) , "r" ) as sc :
            with open ( os.path.join ( WORK_DIR , "output.txt" ) , "w" ) as f :
                case_cnt = len ( sc.readlines ( ) )
                for case_num in range ( case_cnt ) :
                    print ( "Processing test case " + str ( case_num + 1 ) , end = '' )
                    f.write ( "Case #" + str ( case_num + 1 ) + ": " )
                    np.testing.assert_allclose ( sc.read ( ) , sc.read ( ) , rtol = 1e-5 , atol = 1e-5 )
            f.flush ( )
            f.close ( )
            sc.close ( )
    main ( )
