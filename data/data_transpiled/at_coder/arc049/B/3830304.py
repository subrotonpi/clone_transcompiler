def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 1000
    def xy ( self , t ) :
        R = self.xy [ 0 ] [ 0 ] + t / c [ 0 ]
        L = self.xy [ 0 ] [ 0 ] - t / c [ 0 ]
        U = self.xy [ 0 ] [ 1 ] + t / c [ 0 ]
        D = self.xy [ 0 ] [ 1 ] - t / c [ 0 ]
        for r , l , u , d in zip ( r , L , U , D ) :
            if r < L or l > R or u < D or d > U :
                return False
            else :
                R = min ( R , r )
                L = max ( L , l )
                U = min ( U , u )
                D = max ( D , d )
        return True
    def main ( self ) :
        sc = _main ( self )
        self.n = sc.n
        for i in range ( self.n ) :
            self.xy [ i ] [ 0 ] = sc.x
            self.xy [ i ] [ 1 ] = sc.x
            self.c [ i ] = sc.y
    def check ( self ) :
        return self.n
    def main ( self ) :
        return Main ( self )
