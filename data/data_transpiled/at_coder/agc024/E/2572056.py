def _import ( ) :
    from io import StringIO
    from io import BufferedReader
    from io import BufferedReader
    from io import BufferedReader
    from io import BufferedReader
    class Main ( object ) :
        def __init__ ( self ) :
            self.M = 0
            self.N , self.K = 1 , 1
            self.comb = [ ]
            self.table = [ ]
            self.acum_table = [ ]
        def calcComb ( self ) :
            self.comb.append ( [ 1 ] )
            self.comb [ 0 ] = [ 0 ]
            for i in range ( 1 , self.N + 1 ) :
                self.comb.append ( [ i ] )
                self.comb [ i ] = 1
                for j in range ( 1 , self.i ) :
                    self.comb [ i ] [ j ] = ( self.comb [ i - 1 ] [ j - 1 ] + self.comb [ i - 1 ] [ j ] ) % M
        def calc ( self ) :
            self.table = [ ]
            self.acum_table = [ ]
            for n in range ( 0 , self.N + 1 ) :
                for k in range ( 0 , self.K + 1 ) :
                    if n == 0 :
                        self.table [ n ] [ k ] = 1
                        self.acum_table [ n ] [ k ] = ( self.table [ n ] [ k ] + ( self.acum_table [ n ] [ k - 1 ] if k > 0 else 0 ) ) % M
                        continue
                    self.table [ n ] [ k ] = 0
                    for i in range ( 1 , self.n + 1 ) :
                        tmp = ( self.comb [ n - 1 ] [ i - 1 ] * self.table [ n - i ] [ k ] ) % M
                        tmp2 = ( self.acum_table [ i - 1 ] [ K ] + M - self.acum_table [ i - 1 ] [ k ] ) % M
                        self.table [ n ] [ k ] += tmp * tmp2
                        self.acum_table [ n ] [ k ] %= M
                self.acum_table [ n ] [ k ] = ( self.table [ n ] [ k ] + ( self.acum_table [ n ] [ k - 1 ] if k > 0 else