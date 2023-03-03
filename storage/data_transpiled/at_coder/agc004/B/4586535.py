def import import numpy
from numpy.core import loadtxt
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.x = long ( self.x )
        self.as = [ ]
        for i in range ( self.n ) :
            self.as.append ( loadtxt ( self.x ) )
    def run ( self ) :
        b = loadtxt ( self.n )
        b [ 0 ] = 1 << 50
        idx = 1
        ans = 1 << 50
        for k in range ( self.n ) :
            sum = 0
            for i in range ( self.n ) :
                b [ idx ] [ i ] = min ( b [ 1 - idx ] [ i ] , self.as [ ( i + self.n - k ) % self.n ] )
                sum += b [ idx ] [ i ]
            ans = min ( ans , k * x + sum )
            idx = 1 - idx
        print ( ans )
