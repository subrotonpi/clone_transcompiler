def main ( ) : return
import sys
import math
import numpy as np
import numpy.testing as npt
class Main ( object ) :
    def __init__ ( self ) :
        self.p = P3 ( )
        self.solve ( )
class P3 ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        self.stdout = sys.stdout
    def circle ( self , x ) :
        y = np.sqrt ( 1 - x ** 2 )
        return ( np.arccos ( x ) - x * y ) / 2
    def f1 ( self , x , y ) :
        if x ** 2 + y ** 2 >= 1 :
            return 0
        x2 = np.sqrt ( 1 - y ** 2 )
        return self.circle ( x ) - self.circle ( x2 ) - ( x2 - x ) * y
    def f2 ( self , x1 , x2 , y1 , y2 ) :
        if x2 ** 2 + y2 ** 2 < 1 :
            return ( x2 - x1 ) * ( y2 - y1 )
        if x1 ** 2 + y1 ** 2 > 1 :
            return 0
        return f1 ( x1 , y1 ) + f1 ( x2 , y2 ) - f1 ( x1 , y2 ) - f1 ( x2 , y1 )
    def solve1 ( self ) :
        f , R , t = self.input
        r , g = self.input
        R2 = R - t - f
        r2 = ( r + f ) / R2
        g2 = ( g - 2 * f ) / R2
        if g2 <= 0 :
            print ( '1.000000' )
            return
        c = r2 + g2 + r2
        n = int ( 1.0 / c + 2 )
        total = 0
        for i in range ( n ) :
            for j in range ( n ) :
                x1 , y1 = c * i + r2 , c * j + r2
                x2 , y2 = x1 + g2 , y1 + g2
                total += f2 ( x1 , x2 , y1 , y2 )
        total /= ( ( R ** 2 * math.pi / 4 ) / ( R2 ** 2 ) )
        print ( '%.8f' % ( 1 - total ) )
return Main
