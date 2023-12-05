def main ( ) :
    import os
    import numpy as np
    import scipy.optimize
    class Main ( object ) :
        def __init__ ( self ) :
            self._solve_a = np.zeros ( ( 3 , 3 ) )
        def solve_a ( self ) :
            with self._solve_b ( ) :
                wk = np.zeros ( ( 3 , 3 ) )
                wk [ : ] = np.arange ( 3 )
                wk [ : ] = np.arange ( 3 )
                res = np.linalg.norm ( wk [ : ] - wk [ : ] ) + np.linalg.norm ( wk [ : ] - wk [ : ] )
                self._solve_b ( res )
        def solve_b ( self ) :
            with self._solve_c ( ) :
                num_n = np.sum ( np.abs ( np.arange ( 3 ) ) )
                num_k = np.sum ( np.abs ( np.arange ( 3 ) ) )
                self._solve_d ( res )
        def solve_d ( self ) :
            with self._solve_d ( ) :
                num_n = np.sum ( np.abs ( np.arange ( 3 ) ) )
                num_k = np.sum ( np.abs ( np.arange ( 3 ) ) )
                num_s = np.sum ( np.abs ( np.arange ( 3 ) ) )
                self._solve_d ( res )
