def _import ( ) : return _import ( )
from os import getenv
import sys
class Main ( object ) :
    def solve ( self ) :
        N = sc.__next__ ( )
        Q = sc.__next__ ( )
        X = [ ]
        R = [ ]
        H = [ ]
        for i in range ( N ) :
            X.append ( sc.__next__ ( ) )
        for i in range ( N ) :
            R.append ( sc.__next__ ( ) )
        for i in range ( N ) :
            H.append ( sc.__next__ ( ) )
    def __iter__ ( self ) :
        return ( self.X , self.R , self.H )
    def __next__ ( self ) :
        return ( self.Y , self.H )
    def __iter__ ( self ) :
        return ( self.X , self.R , self.H )
    def __next__ ( self ) :
        return ( self.Y , self.H )
    def __next__ ( self ) :
        return ( self.Y , self.H )
    def calc ( X , R , H , A , B ) :
        if B <= X or X + H <= A :
            return 0
        v1 = calc2 ( X , R , H , A )
        v2 = calc2 ( X , R , H , B )
        return v1 - v2
    def calc2 ( X , R , H , A ) :
        if A < X :
            A = X
        if X + H <= A :
            return 0
        h = ( X + H - A )
        r = R * ( X + H - A ) / ( H )
        return r ** 2 * math.pi * h / 3
    def tr ( * os ) :
        sys.stderr.write ( deeprepr ( os ) )
    def tr ( self , as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as