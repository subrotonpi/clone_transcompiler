def _import ( ) : return ( x >= 0 and y >= 0 and x < w and y < h )
from math import pow
from pygame import Surface
class B :
    def __init__ ( self , f , g , b ) :
        self.f = f
        self.g = g
        self.n = int ( f.read ( ) )
        for i in range ( n ) :
            print ( "Case #%d: %s" % ( i + 1 , B ( ).solve ( ) ) , file = self.f )
    def solve ( self ) :
        w , h = self.size
        x1 , y1 , x2 , y2 = self.size
        x0 , y0 = self.size
        def x ( self ) : return x0
        def y ( self ) : return y0
        m = set ( )
        self.dfs ( ( x , y ) , x1 , y1 , x2 , y2 , w , h , m )
        return len ( m )
    def dfs ( p , x1 , y1 , x2 , y2 , w , h , m ) :
        if p in m : return
        if not self.isOk ( p [ 0 ] , p [ 1 ] , w , h ) : return
        m.add ( p )
        self.dfs ( ( p [ 0 ] + x1 , p [ 1 ] + y1 ) , x1 , y1 , x2 , y2 , w , h , m )
        self.dfs ( ( p [ 0 ] + x2 , p [ 1 ] + y2 ) , x1 , y1 , x2 , y2 , w , h , m )
    def count ( self , x , y , dx , dy , w , h ) :
        l = 0
        r = 2000000
        while r > l + 1 :
            m = ( l + r ) / 2
            xx = x + m * dx
            yy = y + m * dy
            if self.isOk ( xx , yy , w , h ) :
                l = m
            else :
                r = m
        return r
