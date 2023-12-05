def round_B2013 ( ) :
    import sys
    from scipy.sparse import csc_matrix
    from scipy.sparse import csc_matrix
    from scipy.sparse.linalg import solve
    class B ( object ) :
        def __init__ ( self ) :
            super ( B , self ).__init__ ( )
        def readline ( self ) :
            while not self._readline or not self._readline :
                self._readline = csc_matrix.readline ( self._readline )
            return self._readline
        def randint ( self ) :
            return int ( self._readline )
        def long ( self ) :
            return long ( self._readline )
        def uniform ( self ) :
            return float ( self._readline )
        def solve ( self ) :
            n = self._readline ( )
            x = self._randint ( )
            y = self._randint ( )
            c = 0
            while n >= 4 * c + 1 :
                n -= 4 * c + 1
                c += 1
            if x < 0 :
                x = - x
            if x + y <= 2 * ( c - 1 ) :
                self._solve ( )
                return
            if x + y > 2 * c :
                self._solve ( )
                return
            p = [ 1 ] * ( 2 * c + 1 )
            tp = [ 0 ] * ( 2 * c + 1 )
            ans = 0
            for i in range ( n ) :
                for j in range ( len ( tp ) ) :
                    if i - j >= 2 * c :
                        tp [ j + 1 ] += p [ j ]
                        continue
                    if j == 2 * c :
                        tp [ j ] += p [ j ]
                        continue
                    tp [ j ] += p [ j ] / 2
                    tp [ j + 1 ] += p [ j ] / 2
                for j in range ( len ( tp ) ) :
                    p [ j ] = tp [ j ]
                    tp [ j ] = 0
            for i in range ( y + 1 , len ( tp ) ) :
                ans += p [ i ]
        self._solve ( )
    return B
