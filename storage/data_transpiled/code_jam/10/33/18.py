def _import ( ) :
    from os import open
    from os import urandom
    from os import urandom
    from os.path import join
    class cd ( object ) :
        def isprop ( self , t , i , j , s ) :
            z = self.t [ i ] [ j ]
            for k in range ( i , i + s - 1 ) :
                for p in range ( j , i + s - 1 ) :
                    if self.t [ k ] [ p ] == - 1 :
                        return False
                    elif self.t [ k ] [ p ] != ( ( z + ( k - i ) + ( p - j ) ) % 2 ) :
                        return False
        def main ( self , args ) :
            f = open ( "A.in" , "w" )
            c = int ( f.readline ( ) )
            g = [ ]
            n , m = 0 , 0
            for p in range ( 1 , c + 1 ) :
                g = [ ]
                m = int ( g.readline ( ) )
                n = int ( g.readline ( ) )
            if d == 'B' :
                t [ i ] [ j ] = 1
                t [ i ] [ j + 1 ] = 0
                for i in range ( m ) :
                    y = f.readline ( )
                    cv = 0
                    for j in range ( len ( y ) ) :
                        upd ( y [ j ] , t , i , cv )
                        cv = cv + 4
            jl = [ ]
            for k in range ( min ( m , n ) + 1 ) :
                gm = False
                for i in range ( 0 , m - k ) :
                    for j in range ( 0 , n - k ) :
                        if self.t [ i ] [ j ] == 0 :
                            self.write ( "%s\n" % self.t [ i ] [ j ] )
            w.close ( )
    total = 0
    for i in range ( 1 , min ( m , n ) + 1 ) :
        if self.t [ i ] [ j ] == 1 :
            t [ i ] [ j ] = 0
    return cd ( t , total )
