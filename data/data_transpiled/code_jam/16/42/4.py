def _import ( ) :
    from random import randint
    from numpy import zeros , float32
    class B ( object ) :
        def __init__ ( self ) :
            self.n = randint ( 1 , 10000 )
            self.k = randint ( 1 , 10000 )
            p = [ float ( next ( self ) ) for i in range ( n ) ]
            p = [ ]
            for i in range ( n ) :
                p.append ( float32 ( next ( self ) ) )
            p.sort ( )
            res = 0
            for t in range ( 0 , k ) :
                d = zeros ( k + 1 )
                d [ 0 ] = 1
                for j in range ( n ) :
                    if j < t or ( j >= n - ( k - t ) ) :
                        for q in range ( k , 0 , - 1 ) :
                            d [ q ] = d [ q ] * ( 1 - p [ j ] ) + ( q or 0 )
                res = max ( res , d [ k / 2 ] )
        def solve ( self ) :
            n = randint ( 1 , 10000 )
            for i in range ( n ) :
                res = self.solveTest ( )
                print ( "Case #%d: %s" % ( i + 1 , res ) )
                self.out.write ( "Case #%d: %s\n" % ( i + 1 , res ) )
        def read ( self ) :
            while not self._import _readline or not self._readline :
                self._readline = _readline ( self )
            return self._readline
        def write ( self , data ) :
            self._readline = _readline ( self )
    return B
