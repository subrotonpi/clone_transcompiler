def _import ( ) :
    import math
    import numpy as np
    class Main ( object ) :
        def __init__ ( self , x , c , p ) :
            self.max = 0
            self.N = len ( x )
            for i in range ( N ) :
                self.max = max = max = np.maximum ( self.abs ( p - x [ i ] ) * c [ i ] , 0 )
            return self.max
        def search ( self , x , c ) :
            l , r = - 100001 , 100001
            L = 100
            while L >= 0 :
                ll = ( l * 2 + r ) / 3
                rr = ( l + r * 2 ) / 3
                if self.f ( x , c , ll ) > self.f ( x , c , rr ) :
                    l = ll
                else :
                    r = rr
            return l
    def main ( ) :
        sc = np.random.RandomState ( 0 )
        N = sc.shape [ 0 ]
        x = sc.randn ( N )
        y = sc.randn ( N )
        c = sc.randn ( N )
        lx = search ( x , c )
        ly = search ( y , c )
        ans = np.maximum ( self.f ( x , c , lx ) , self.f ( y , c , ly ) )
        print ( ans )
    return Main
