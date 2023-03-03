def _ _ main _ _ ( ) :
    import numpy as np
    import numpy.testing.olap as sc
    import numpy.testing.olap as vt
    class ProblemD ( vt.DMatrix ) :
        def mul ( self , a , b ) :
            L = len ( a )
            tmp = np.zeros ( ( L , L ) )
            for i in range ( K - 1 ) :
                for k in range ( L ) :
                    tmp [ i , k ] += a [ i , j ] * b [ j , k ]
            self._mat = mat
            for i in range ( L ) :
                for j in range ( L ) :
                    self._mat [ i , j ] = ( 1 if i == j else 0 )
            self._mat = mat
            return self._mat
        def pow ( self , a , d ) :
            L = len ( a )
            if d == 0 :
                res = np.zeros ( ( L , L ) )
                for i in range ( L ) :
                    for j in range ( L ) :
                        self._mat [ i , j ] = ( 1 if i == j else 0 )
                return res
            res = pow ( a , d / 2 )
            res = self._mul ( res , res )
            if d % 2 == 1 :
                res = self._mul ( res , a )
            return res
        def do_main ( self ) :
            with sc.open ( 'input.txt' , 'r' ) as f :
                with open ( 'output.txt' , 'w' ) as f :
                    self._mat = f
                    self._mat = mat
    return ProblemD
