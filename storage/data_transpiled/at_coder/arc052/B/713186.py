def _solve_2 ( ) :
    import numpy as np
    from scipy.optimize import solve
    solve2 ( )
    class Main ( object ) :
        def __init__ ( self ) :
            self._solve_2 = 0
        def solve ( self ) :
            scn = np.linalg.solve
            N , Q = scn.shape
            v = np.zeros ( 200001 )
            for k in range ( N ) :
                X , R , H = np.ogrid [ 0 : N , 0 : Q ]
                tmpr = R
                for s in range ( X , X + H ) :
                    v [ s ] += ( tmpr ** 2 + tmpr ** 2 - float ( R ) / H ) + ( tmpr - float ( R ) / H ) ** 2 * np.pi / 3
                    tmpr -= float ( R ) / H
            for k in range ( Q ) :
                A , B = np.ogrid [ 0 : N , 0 : N ]
                tmp = 0
                for s in range ( A , B ) :
                    tmp += v [ s ]
                self._solve_2.solve ( tmp )
    return Main
